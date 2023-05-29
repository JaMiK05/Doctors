package uz.gita.imtihon3oy.domain.usecases.signinusecase

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.request.RegisterRequest
import uz.gita.imtihon3oy.data.model.response.MessageResponse
import uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository
import javax.inject.Inject

class SignInUseCaseimpl @Inject constructor(
    private val repository: AuthRepository,
) : SigninUseCase {

    override fun registr(request: RegisterRequest): Flow<Result<MessageResponse>> =
        repository.signUp(request)

}