package uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.gita.imtihon3oy.data.model.NotifyData

interface NotifyViewModel {
    val notifyLiveData: LiveData<List<NotifyData>>
    val errorLiveData: MutableLiveData<String>
    val loadingLiveData: MutableLiveData<Boolean>


    fun getNews()
}