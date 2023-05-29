package uz.gita.imtihon3oy.domain.repositories.home

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.NotifyData
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity

interface HomeRepository {
    fun getUserInfo(phone: String): Flow<Result<UserData>>

    suspend fun getDoctors(): Result<List<DoctorEntity>>

    fun getFavouriteDoctors(): List<DoctorEntity>

    fun clickedFavourite(id: Long)

    suspend fun getNews(): Result<List<NotifyData>>
    fun getLikeBooks(like: String): List<DoctorEntity>
}