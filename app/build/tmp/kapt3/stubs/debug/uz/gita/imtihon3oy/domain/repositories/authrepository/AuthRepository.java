package uz.gita.imtihon3oy.domain.repositories.authrepository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000J%\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u00040\u00032\u0006\u0010\n\u001a\u00020\u0005H&\u00f8\u0001\u0000J%\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u00040\u00032\u0006\u0010\n\u001a\u00020\u0005H&\u00f8\u0001\u0000J\u001f\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&\u00f8\u0001\u0000J\u001f\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\n\u001a\u00020\u0012H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Luz/gita/imtihon3oy/domain/repositories/authrepository/AuthRepository;", "", "addUser", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "user", "Luz/gita/imtihon3oy/data/model/response/UserData;", "loginEmail", "", "request", "loginPhone", "signUp", "Luz/gita/imtihon3oy/data/model/response/MessageResponse;", "registerRequest", "Luz/gita/imtihon3oy/data/model/request/RegisterRequest;", "verify", "Luz/gita/imtihon3oy/data/model/response/VerifyResponse;", "Luz/gita/imtihon3oy/data/model/request/VerifyRequest;", "app_debug"})
public abstract interface AuthRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.imtihon3oy.data.model.response.MessageResponse>> signUp(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.RegisterRequest registerRequest);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.imtihon3oy.data.model.response.UserData>>> loginEmail(@org.jetbrains.annotations.NotNull
    java.lang.String request);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.imtihon3oy.data.model.response.UserData>>> loginPhone(@org.jetbrains.annotations.NotNull
    java.lang.String request);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.imtihon3oy.data.model.response.VerifyResponse>> verify(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.VerifyRequest request);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addUser(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.response.UserData user);
}