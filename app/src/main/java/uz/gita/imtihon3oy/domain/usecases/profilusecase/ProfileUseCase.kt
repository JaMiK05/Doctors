package uz.gita.imtihon3oy.domain.usecases.profilusecase

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.ProfileData

interface ProfileUseCase {
    fun addProfile(profileData: ProfileData): Flow<Result<Unit>>
}