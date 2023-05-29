package uz.gita.imtihon3oy.data.source.remote.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import uz.gita.imtihon3oy.data.model.request.RegisterRequest
import uz.gita.imtihon3oy.data.model.request.VerifyRequest
import uz.gita.imtihon3oy.data.model.response.MessageResponse
import uz.gita.imtihon3oy.data.model.response.VerifyResponse

interface AuthApi {

    @POST("api/v1/register")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<MessageResponse>

    @POST("/api/v1/register/verify")
    suspend fun verify(@Body request: VerifyRequest): Response<VerifyResponse>

}