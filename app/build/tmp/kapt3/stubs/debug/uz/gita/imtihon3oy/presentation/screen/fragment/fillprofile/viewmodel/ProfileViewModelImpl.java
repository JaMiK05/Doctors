package uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/fillprofile/viewmodel/ProfileViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/imtihon3oy/presentation/screen/fragment/fillprofile/viewmodel/ProfileViewModel;", "useCase", "Luz/gita/imtihon3oy/domain/usecases/profilusecase/ProfileUseCase;", "(Luz/gita/imtihon3oy/domain/usecases/profilusecase/ProfileUseCase;)V", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "openNextScreenLiveData", "", "getOpenNextScreenLiveData", "addProfile", "data", "Luz/gita/imtihon3oy/data/model/ProfileData;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProfileViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel.ProfileViewModel {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> openNextScreenLiveData = null;
    
    @javax.inject.Inject
    public ProfileViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase useCase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getOpenNextScreenLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void addProfile(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.ProfileData data) {
    }
}