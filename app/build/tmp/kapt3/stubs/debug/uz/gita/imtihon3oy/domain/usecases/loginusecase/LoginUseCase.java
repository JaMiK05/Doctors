package uz.gita.imtihon3oy.domain.usecases.loginusecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Luz/gita/imtihon3oy/domain/usecases/loginusecase/LoginUseCase;", "", "getUser", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Luz/gita/imtihon3oy/data/model/response/UserData;", "request", "Luz/gita/imtihon3oy/data/model/request/LoginRequest;", "app_debug"})
public abstract interface LoginUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.imtihon3oy.data.model.response.UserData>>> getUser(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.LoginRequest request);
}