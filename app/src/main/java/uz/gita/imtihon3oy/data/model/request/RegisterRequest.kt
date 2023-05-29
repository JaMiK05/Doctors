package uz.gita.imtihon3oy.data.model.request

data class RegisterRequest(
    val firstName: String = "muhammadali",
    val lastName: String = "jahongir",
    val phone: String,
    val password: String,
)
