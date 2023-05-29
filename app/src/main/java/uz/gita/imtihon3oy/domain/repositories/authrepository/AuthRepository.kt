package uz.gita.imtihon3oy.domain.repositories.authrepository

import uz.gita.imtihon3oy.data.model.request.RegisterRequest
import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.request.VerifyRequest
import uz.gita.imtihon3oy.data.model.response.MessageResponse
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.model.response.VerifyResponse


interface AuthRepository {

    fun signUp(registerRequest: RegisterRequest): Flow<Result<MessageResponse>>

    fun loginEmail(request: String): Flow<Result<List<UserData>>>

    fun loginPhone(request: String): Flow<Result<List<UserData>>>

    fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>>

    fun addUser(user: UserData): Flow<Result<String>>


}