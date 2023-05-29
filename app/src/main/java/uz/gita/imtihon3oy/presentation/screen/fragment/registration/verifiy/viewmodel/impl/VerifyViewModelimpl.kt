package uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.imtihon3oy.data.model.request.VerifyRequest
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.model.response.VerifyResponse
import uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCase
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.VerifyViewModel
import javax.inject.Inject

@HiltViewModel
class VerifyViewModelimpl @Inject constructor(
    private val verifyUseCase: VerifyUseCase,
) : ViewModel(), VerifyViewModel {
    override val succesLiveData = MutableLiveData<VerifyResponse>()
    override val addLiveData = MutableLiveData<String>()

    override val failLiveData = MutableLiveData<String>()

    override fun verify(request: VerifyRequest) {
        verifyUseCase.verify(request).onEach { result ->
            result.onSuccess {
                succesLiveData.value = it
            }
            result.onFailure {
                failLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }

    override fun addUser(user: UserData) {
        verifyUseCase.addUser(user).onEach { result ->
            result.onSuccess {
                addLiveData.value = it
            }
            result.onFailure {

            }
        }.launchIn(viewModelScope)
    }

}