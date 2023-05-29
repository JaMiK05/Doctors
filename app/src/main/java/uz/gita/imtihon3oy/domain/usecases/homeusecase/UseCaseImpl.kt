package uz.gita.imtihon3oy.domain.usecases.homeusecase

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.NotifyData
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity
import uz.gita.imtihon3oy.domain.repositories.home.HomeRepository
import javax.inject.Inject

class UseCaseImpl @Inject constructor(
    private val repository: HomeRepository,
) : UseCase {
    override fun getUserInfo(phone: String): Flow<Result<UserData>> = repository.getUserInfo(phone)

    override suspend fun getDoctors(): Result<List<DoctorEntity>> = repository.getDoctors()

    override fun getFavouriteDoctors(): List<DoctorEntity> = repository.getFavouriteDoctors()

    override fun clickedFavourite(id: Long) = repository.clickedFavourite(id)
    override suspend fun getNews(): Result<List<NotifyData>> = repository.getNews()
    override fun search(like: String): List<DoctorEntity> = repository.getLikeBooks(like)
}