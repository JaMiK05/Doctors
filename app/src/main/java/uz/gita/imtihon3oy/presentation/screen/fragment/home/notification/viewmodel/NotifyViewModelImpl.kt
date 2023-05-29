package uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.gita.imtihon3oy.data.model.NotifyData
import uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase
import javax.inject.Inject

@HiltViewModel
class NotifyViewModelImpl @Inject constructor(
    private val useCase: UseCase
): NotifyViewModel, ViewModel() {

    override val errorLiveData = MutableLiveData<String>()
    override val notifyLiveData = MutableLiveData<List<NotifyData>>()
    override val loadingLiveData = MutableLiveData<Boolean>()


    override fun getNews() {
        loadingLiveData.value = true
        viewModelScope.launch {
            useCase.getNews().onSuccess {
                notifyLiveData.value = it
            }.onFailure {
                errorLiveData.value = it.message
            }
            loadingLiveData.value = false
        }
    }

}