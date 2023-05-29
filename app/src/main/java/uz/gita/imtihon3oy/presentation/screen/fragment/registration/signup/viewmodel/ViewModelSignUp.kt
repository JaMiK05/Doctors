package uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.imtihon3oy.data.model.request.RegisterRequest
import uz.gita.imtihon3oy.data.model.response.MessageResponse

interface ViewModelSignUp {

    val resultLiveData: LiveData<MessageResponse>

    val failLiveData: LiveData<String>

    fun signUp(registerRequest: RegisterRequest)

}