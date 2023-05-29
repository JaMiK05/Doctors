package uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/registration/signup/viewmodel/impl/SignViewModeImplUp;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/imtihon3oy/presentation/screen/fragment/registration/signup/viewmodel/ViewModelSignUp;", "useCase", "Luz/gita/imtihon3oy/domain/usecases/signinusecase/SigninUseCase;", "(Luz/gita/imtihon3oy/domain/usecases/signinusecase/SigninUseCase;)V", "failLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getFailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "resultLiveData", "Luz/gita/imtihon3oy/data/model/response/MessageResponse;", "getResultLiveData", "signUp", "", "registerRequest", "Luz/gita/imtihon3oy/data/model/request/RegisterRequest;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignViewModeImplUp extends androidx.lifecycle.ViewModel implements uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.ViewModelSignUp {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<uz.gita.imtihon3oy.data.model.response.MessageResponse> resultLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> failLiveData = null;
    
    @javax.inject.Inject
    public SignViewModeImplUp(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase useCase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<uz.gita.imtihon3oy.data.model.response.MessageResponse> getResultLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getFailLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void signUp(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.RegisterRequest registerRequest) {
    }
}