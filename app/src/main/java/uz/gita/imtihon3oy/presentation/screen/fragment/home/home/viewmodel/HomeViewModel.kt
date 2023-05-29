package uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity

interface HomeViewModel {
    val userLiveData:LiveData<UserData>
    val doctorsLiveData:LiveData<List<DoctorEntity>>
    val searchListLiveData: LiveData<List<DoctorEntity>>
    val errorLiveData: LiveData<String>

    fun getDoctors()
    fun changeFavoutite(id:Long)
    fun getUserInformations(phone:String)
    fun searchFun(text: String)
    val loadingLiveData: MutableLiveData<Boolean>
}