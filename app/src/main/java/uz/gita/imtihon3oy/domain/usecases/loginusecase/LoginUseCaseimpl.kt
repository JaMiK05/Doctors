package uz.gita.imtihon3oy.domain.usecases.loginusecase

import android.util.Log
import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.request.LoginRequest
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository
import javax.inject.Inject

class LoginUseCaseimpl @Inject constructor(
    private val repository: AuthRepository,
) : LoginUseCase {

    override fun getUser(request: LoginRequest): Flow<Result<List<UserData>>> {
        var bool = true
        request.phone.forEach { ch ->
            if (ch.isLetter()) bool = false
        }
        return if (bool) {
            repository.loginPhone(request.phone)
        } else {
            repository.loginEmail(request.phone)
        }
    }

}