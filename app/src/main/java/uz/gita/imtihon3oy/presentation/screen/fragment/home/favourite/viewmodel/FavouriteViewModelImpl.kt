package uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity
import uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase
import javax.inject.Inject

@HiltViewModel
class FavouriteViewModelImpl @Inject constructor(
    private val useCase: UseCase
): FavouriteViewModel, ViewModel() {
    override val errorLiveData = MutableLiveData<String>()
    override val doctorsLiveData = MutableLiveData<List<DoctorEntity>>()
    override val loadingLiveData = MutableLiveData<Boolean>()


    override fun getFavouriteDocs() {
        loadingLiveData.value = false

        doctorsLiveData.value = useCase.getFavouriteDoctors()
    }

    override fun changeFavoutite(id: Long) {
        useCase.clickedFavourite(id)
        doctorsLiveData.value = useCase.getFavouriteDoctors()
    }


}