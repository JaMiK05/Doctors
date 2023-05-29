package uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel

import android.net.Uri
import androidx.core.net.toUri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.imtihon3oy.data.model.ProfileData
import uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase
import javax.inject.Inject

@HiltViewModel
class ProfileViewModelImpl @Inject constructor(private val useCase: ProfileUseCase) : ViewModel(),
    ProfileViewModel {
    override val errorLiveData = MutableLiveData<String>()
    override val openNextScreenLiveData = MutableLiveData<Unit>()

    override fun addProfile(
        data: ProfileData,
    ) {
        useCase.addProfile(data)
            .onEach {
                it.onSuccess {
                    openNextScreenLiveData.value = Unit
                }
                it.onFailure {
                    errorLiveData.value = it.message
                }
            }.launchIn(viewModelScope)
    }
}