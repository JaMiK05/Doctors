package uz.gita.imtihon3oy.domain.usecases.verifyusecase

import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.request.VerifyRequest
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.model.response.VerifyResponse

interface VerifyUseCase {

    fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>>

    fun addUser(user: UserData): Flow<Result<String>>

}