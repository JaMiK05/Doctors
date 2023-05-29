package uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.impl

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.imtihon3oy.data.model.request.LoginRequest
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCase
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.LoginViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModelimpl @Inject constructor(
    private val useCase: LoginUseCase,
) : ViewModel(), LoginViewModel {


    override val resultLiveData = MutableLiveData<UserData>()
    override val failLiveData = MutableLiveData<String>()

    override fun logIn(registerRequest: LoginRequest) {
        useCase.getUser(registerRequest).onEach { result ->

            result.onSuccess { list ->
                if (list.isEmpty()) {
                    failLiveData.value = "Not user"
                } else {
                    val data = list[0]
                    if (data.password == registerRequest.password) {
                        resultLiveData.value = data
                    } else {
                        failLiveData.value = "Fail"
                    }
                }
            }

            result.onFailure {
                failLiveData.value = "Fail"
            }

        }.launchIn(viewModelScope)

    }


}