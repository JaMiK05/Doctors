package uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity

interface FavouriteViewModel {
    val doctorsLiveData: LiveData<List<DoctorEntity>>
    val errorLiveData: MutableLiveData<String>
    val loadingLiveData: MutableLiveData<Boolean>


    fun getFavouriteDocs()
    fun changeFavoutite(id: Long)
}