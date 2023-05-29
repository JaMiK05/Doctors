package uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0011H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u0015"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/home/favourite/viewmodel/FavouriteViewModel;", "", "doctorsLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "getDoctorsLiveData", "()Landroidx/lifecycle/LiveData;", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingLiveData", "", "getLoadingLiveData", "changeFavoutite", "", "id", "", "getFavouriteDocs", "app_debug"})
public abstract interface FavouriteViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity>> getDoctorsLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData();
    
    public abstract void getFavouriteDocs();
    
    public abstract void changeFavoutite(long id);
}