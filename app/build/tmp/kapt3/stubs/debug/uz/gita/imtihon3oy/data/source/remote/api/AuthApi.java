package uz.gita.imtihon3oy.data.source.remote.api;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Luz/gita/imtihon3oy/data/source/remote/api/AuthApi;", "", "register", "Lretrofit2/Response;", "Luz/gita/imtihon3oy/data/model/response/MessageResponse;", "registerRequest", "Luz/gita/imtihon3oy/data/model/request/RegisterRequest;", "(Luz/gita/imtihon3oy/data/model/request/RegisterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "Luz/gita/imtihon3oy/data/model/response/VerifyResponse;", "request", "Luz/gita/imtihon3oy/data/model/request/VerifyRequest;", "(Luz/gita/imtihon3oy/data/model/request/VerifyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthApi {
    
    @retrofit2.http.POST(value = "api/v1/register")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object register(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.RegisterRequest registerRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<uz.gita.imtihon3oy.data.model.response.MessageResponse>> $completion);
    
    @retrofit2.http.POST(value = "/api/v1/register/verify")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object verify(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.VerifyRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<uz.gita.imtihon3oy.data.model.response.VerifyResponse>> $completion);
}