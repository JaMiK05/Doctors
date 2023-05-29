package uz.gita.imtihon3oy.domain.usecases.signinusecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Luz/gita/imtihon3oy/domain/usecases/signinusecase/SignInUseCaseimpl;", "Luz/gita/imtihon3oy/domain/usecases/signinusecase/SigninUseCase;", "repository", "Luz/gita/imtihon3oy/domain/repositories/authrepository/AuthRepository;", "(Luz/gita/imtihon3oy/domain/repositories/authrepository/AuthRepository;)V", "registr", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Luz/gita/imtihon3oy/data/model/response/MessageResponse;", "request", "Luz/gita/imtihon3oy/data/model/request/RegisterRequest;", "app_debug"})
public final class SignInUseCaseimpl implements uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository repository = null;
    
    @javax.inject.Inject
    public SignInUseCaseimpl(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.imtihon3oy.data.model.response.MessageResponse>> registr(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.RegisterRequest request) {
        return null;
    }
}