package uz.gita.imtihon3oy.data.model

import android.net.Uri
import androidx.core.net.toUri

data class ProfileData(
    val name: String,
    val nickname: String,
    val dateOfBirth: String,
    val email: String,
    val password: String,
    val phone: String,
    val gender: String,
    var imgUri: Uri = "https://firebasestorage.googleapis.com/v0/b/imtihon-3-oy.appspot.com/o/avatar.png?alt=media&token=e9ec9df7-4f5e-4e75-9217-099b44d673bb".toUri(),
)
