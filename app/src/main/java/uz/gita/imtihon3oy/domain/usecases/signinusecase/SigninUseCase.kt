package uz.gita.imtihon3oy.domain.usecases.signinusecase

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow
import uz.gita.imtihon3oy.data.model.request.RegisterRequest
import uz.gita.imtihon3oy.data.model.response.MessageResponse

interface SigninUseCase {


    fun registr(request: RegisterRequest): Flow<Result<MessageResponse>>

}