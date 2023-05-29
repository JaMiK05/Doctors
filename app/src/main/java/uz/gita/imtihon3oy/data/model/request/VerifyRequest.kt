package uz.gita.imtihon3oy.data.model.request

data class VerifyRequest(
    val phone: String,
    val code: String,
)
