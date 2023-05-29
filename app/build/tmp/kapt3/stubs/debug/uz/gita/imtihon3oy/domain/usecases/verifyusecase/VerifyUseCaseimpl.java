package uz.gita.imtihon3oy.domain.usecases.verifyusecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00f8\u0001\u0000J\u001f\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Luz/gita/imtihon3oy/domain/usecases/verifyusecase/VerifyUseCaseimpl;", "Luz/gita/imtihon3oy/domain/usecases/verifyusecase/VerifyUseCase;", "repository", "Luz/gita/imtihon3oy/domain/repositories/authrepository/AuthRepository;", "(Luz/gita/imtihon3oy/domain/repositories/authrepository/AuthRepository;)V", "addUser", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "user", "Luz/gita/imtihon3oy/data/model/response/UserData;", "verify", "Luz/gita/imtihon3oy/data/model/response/VerifyResponse;", "request", "Luz/gita/imtihon3oy/data/model/request/VerifyRequest;", "app_debug"})
public final class VerifyUseCaseimpl implements uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCase {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository repository = null;
    
    @javax.inject.Inject
    public VerifyUseCaseimpl(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository repository) {
        super();
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
}