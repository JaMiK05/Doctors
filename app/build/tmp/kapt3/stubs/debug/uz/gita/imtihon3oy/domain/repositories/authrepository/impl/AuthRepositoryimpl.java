package uz.gita.imtihon3oy.domain.repositories.authrepository.impl;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00f8\u0001\u0000J%\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\t0\b2\u0006\u0010\u000f\u001a\u00020\nH\u0016\u00f8\u0001\u0000J%\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\t0\b2\u0006\u0010\u000f\u001a\u00020\nH\u0016\u00f8\u0001\u0000J\u001f\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00f8\u0001\u0000J\u001f\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0016\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Luz/gita/imtihon3oy/domain/repositories/authrepository/impl/AuthRepositoryimpl;", "Luz/gita/imtihon3oy/domain/repositories/authrepository/AuthRepository;", "authApi", "Luz/gita/imtihon3oy/data/source/remote/api/AuthApi;", "(Luz/gita/imtihon3oy/data/source/remote/api/AuthApi;)V", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addUser", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "user", "Luz/gita/imtihon3oy/data/model/response/UserData;", "loginEmail", "", "request", "loginPhone", "signUp", "Luz/gita/imtihon3oy/data/model/response/MessageResponse;", "registerRequest", "Luz/gita/imtihon3oy/data/model/request/RegisterRequest;", "verify", "Luz/gita/imtihon3oy/data/model/response/VerifyResponse;", "Luz/gita/imtihon3oy/data/model/request/VerifyRequest;", "app_debug"})
public final class AuthRepositoryimpl implements uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.data.source.remote.api.AuthApi authApi = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    
    @javax.inject.Inject
    public AuthRepositoryimpl(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.source.remote.api.AuthApi authApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.imtihon3oy.data.model.response.MessageResponse>> signUp(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.RegisterRequest registerRequest) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.imtihon3oy.data.model.response.VerifyResponse>> verify(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.VerifyRequest request) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addUser(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.response.UserData user) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.imtihon3oy.data.model.response.UserData>>> loginEmail(@org.jetbrains.annotations.NotNull
    java.lang.String request) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.imtihon3oy.data.model.response.UserData>>> loginPhone(@org.jetbrains.annotations.NotNull
    java.lang.String request) {
        return null;
    }
}