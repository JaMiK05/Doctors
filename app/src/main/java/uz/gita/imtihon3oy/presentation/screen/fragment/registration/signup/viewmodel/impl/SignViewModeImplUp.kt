package uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.imtihon3oy.data.model.request.RegisterRequest
import uz.gita.imtihon3oy.data.model.response.MessageResponse
import uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.ViewModelSignUp
import javax.inject.Inject


@HiltViewModel
class SignViewModeImplUp @Inject constructor(
    private val useCase: SigninUseCase,
) : ViewModel(), ViewModelSignUp {

    override val resultLiveData = MutableLiveData<MessageResponse>()
    override val failLiveData = MutableLiveData<String>()

    override fun signUp(registerRequest: RegisterRequest) {
        Log.d("TTT", "sign up viewModel")
//        viewModelScope.launch {
        useCase.registr(registerRequest).onEach { result ->

            result.onSuccess {
                Log.d("TTT", "sign up succes")
                resultLiveData.value = it
            }
            result.onFailure {
                Log.d("TTT", "sign up fail")
                failLiveData.value = it.message
            }

        }.launchIn(viewModelScope)

    }


}