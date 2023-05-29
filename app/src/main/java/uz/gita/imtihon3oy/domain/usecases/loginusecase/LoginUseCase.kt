package uz.gita.imtihon3oy.domain.usecases.loginusecase

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.request.LoginRequest
import uz.gita.imtihon3oy.data.model.response.UserData


interface LoginUseCase {

    fun getUser(request: LoginRequest): Flow<Result<List<UserData>>>

}