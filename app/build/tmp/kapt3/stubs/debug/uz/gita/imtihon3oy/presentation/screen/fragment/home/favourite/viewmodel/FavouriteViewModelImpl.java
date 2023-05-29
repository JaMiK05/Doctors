package uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/home/favourite/viewmodel/FavouriteViewModelImpl;", "Luz/gita/imtihon3oy/presentation/screen/fragment/home/favourite/viewmodel/FavouriteViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Luz/gita/imtihon3oy/domain/usecases/homeusecase/UseCase;", "(Luz/gita/imtihon3oy/domain/usecases/homeusecase/UseCase;)V", "doctorsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "getDoctorsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "errorLiveData", "", "getErrorLiveData", "loadingLiveData", "", "getLoadingLiveData", "changeFavoutite", "", "id", "", "getFavouriteDocs", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class FavouriteViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel.FavouriteViewModel {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity>> doctorsLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    
    @javax.inject.Inject
    public FavouriteViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase useCase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity>> getDoctorsLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void getFavouriteDocs() {
    }
    
    @java.lang.Override
    public void changeFavoutite(long id) {
    }
}