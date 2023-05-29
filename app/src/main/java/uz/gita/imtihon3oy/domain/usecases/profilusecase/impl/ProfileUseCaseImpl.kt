package uz.gita.imtihon3oy.domain.usecases.profilusecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.ProfileData
import uz.gita.imtihon3oy.domain.repositories.profilrepository.ProfileRepository
import uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase
import javax.inject.Inject

class ProfileUseCaseImpl @Inject constructor(private val repository: ProfileRepository) :
    ProfileUseCase {
    override fun addProfile(profileData: ProfileData): Flow<Result<Unit>> =
        repository.addProfile(profileData)
}