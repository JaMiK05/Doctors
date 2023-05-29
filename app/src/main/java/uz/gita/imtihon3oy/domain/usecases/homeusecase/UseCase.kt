package uz.gita.imtihon3oy.domain.usecases.homeusecase

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.NotifyData
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity

interface UseCase {
    fun getUserInfo(phone: String): Flow<Result<UserData>>

    suspend fun getDoctors(): Result<List<DoctorEntity>>

    fun getFavouriteDoctors(): List<DoctorEntity>

    fun clickedFavourite(id: Long)

    suspend fun getNews(): Result<List<NotifyData>>

    fun search(like: String): List<DoctorEntity>
}