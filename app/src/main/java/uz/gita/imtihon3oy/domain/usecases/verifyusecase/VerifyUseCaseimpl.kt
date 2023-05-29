package uz.gita.imtihon3oy.domain.usecases.verifyusecase

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.request.VerifyRequest
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.model.response.VerifyResponse
import uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository
import javax.inject.Inject

class VerifyUseCaseimpl @Inject constructor(
    private val repository: AuthRepository,
) : VerifyUseCase {
    override fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>> =
        repository.verify(request)

    override fun addUser(user: UserData): Flow<Result<String>> =
        repository.addUser(user)

}