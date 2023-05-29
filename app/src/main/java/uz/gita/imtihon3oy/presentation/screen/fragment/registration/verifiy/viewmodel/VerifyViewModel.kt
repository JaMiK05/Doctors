package uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.imtihon3oy.data.model.request.VerifyRequest
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.model.response.VerifyResponse

interface VerifyViewModel {

    val succesLiveData: LiveData<VerifyResponse>
    val addLiveData: LiveData<String>
    val failLiveData: LiveData<String>

    fun verify(request: VerifyRequest)

    fun addUser(user: UserData)

}