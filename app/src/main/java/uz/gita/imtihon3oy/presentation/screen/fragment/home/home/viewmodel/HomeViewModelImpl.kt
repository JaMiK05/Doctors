package uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity
import uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase
import uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel.HomeViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModelImpl @Inject constructor(
    private val useCase: UseCase
): HomeViewModel, ViewModel() {
    override val userLiveData = MutableLiveData<UserData>()
    override val errorLiveData = MutableLiveData<String>()
    override val loadingLiveData = MutableLiveData<Boolean>()
    override val doctorsLiveData = MutableLiveData<List<DoctorEntity>>()
    override val searchListLiveData = MutableLiveData<List<DoctorEntity>>()

    override fun getUserInformations(phone:String) {
        loadingLiveData.value = true
        useCase.getUserInfo(phone).onEach {
            it.onSuccess {
                userLiveData.value = it
            }
            it.onFailure {
                errorLiveData.value = it.message
            }
            loadingLiveData.value = false
        }.launchIn(viewModelScope)
    }

    override fun getDoctors() {
        loadingLiveData.value = true
        viewModelScope.launch {
            useCase.getDoctors().onSuccess {
                doctorsLiveData.value = it
            }.onFailure {
                errorLiveData.value = it.message
            }
            loadingLiveData.value = false
        }
        }

    override fun changeFavoutite(id:Long) {
        useCase.clickedFavourite(id)
        getDoctors()
    }
    override fun searchFun(text: String) {
        searchListLiveData.value =  useCase.search(text)
    }
}