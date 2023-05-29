package uz.gita.imtihon3oy.domain.repositories.profilrepository

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.ProfileData

interface

ProfileRepository {
    fun addProfile(profileData: ProfileData): Flow<Result<Unit>>
}