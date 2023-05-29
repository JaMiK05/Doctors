package uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.imtihon3oy.data.model.request.LoginRequest
import uz.gita.imtihon3oy.data.model.response.UserData

interface LoginViewModel {

    val resultLiveData: LiveData<UserData>

    val failLiveData: LiveData<String>

    fun logIn(registerRequest: LoginRequest)

}