package uz.gita.imtihon3oy.domain.repositories.profilrepository.impl

import android.net.Uri
import androidx.core.net.toUri
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.StorageReference
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import uz.gita.imtihon3oy.data.model.ProfileData
import uz.gita.imtihon3oy.domain.repositories.profilrepository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImp @Inject constructor(
    private val fireStore: FirebaseFirestore,
    private val storageReference: StorageReference,
) : ProfileRepository {

    override fun addProfile(profileData: ProfileData): Flow<Result<Unit>> = callbackFlow {
        val url =
            "https://firebasestorage.googleapis.com/v0/b/imtihon-3-oy.appspot.com/o/avatar.png?alt=media&token=e9ec9df7-4f5e-4e75-9217-099b44d673bb"

        loadImage(profileData.imgUri, "profile_image${profileData.nickname}").onSuccess {
            val collection = fireStore.collection("users")
            collection
                .document(profileData.phone)
                .set(profileData)
                .addOnSuccessListener {
                    trySend(Result.success(Unit))
                }
                .addOnFailureListener {
                    trySend(Result.failure(it))
                }
        }
            .onFailure {
                profileData.imgUri = url.toUri()
                val collection = fireStore.collection("users")
                collection
                    .document(profileData.phone)
                    .set(profileData)
                    .addOnSuccessListener {
                        trySend(Result.success(Unit))
                    }
                    .addOnFailureListener {
                        trySend(Result.failure(it))
                    }
            }
        awaitClose()
    }

    private suspend fun loadImage(uriForImage: Uri, reference: String): Result<Uri> {
        return try {
            val uploadTaskImage = storageReference.child(reference)
                .putFile(uriForImage)
                .await()

            Result.success(uploadTaskImage.storage.downloadUrl.await())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}