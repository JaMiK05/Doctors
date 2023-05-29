package uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel

import android.net.Uri
import androidx.core.net.toUri
import androidx.lifecycle.LiveData
import uz.gita.imtihon3oy.data.model.ProfileData

interface ProfileViewModel {
    val errorLiveData: LiveData<String>
    val openNextScreenLiveData: LiveData<Unit>
    fun addProfile(data: ProfileData)
}