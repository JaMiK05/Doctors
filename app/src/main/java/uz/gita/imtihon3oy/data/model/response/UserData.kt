package uz.gita.imtihon3oy.data.model.response

import android.net.Uri
import androidx.core.net.toUri

data class UserData(
    val name: String = "",
    val nickname: String = "",
    val dateOfBirth: String = "",
    val email: String = "",
    val phone: String,
    val password: String,
    val gender: String = "",
    val imgUri: Uri = "https://firebasestorage.googleapis.com/v0/b/imtihon-3-oy.appspot.com/o/avatar.png?alt=media&token=e9ec9df7-4f5e-4e75-9217-099b44d673bb".toUri(),
)
