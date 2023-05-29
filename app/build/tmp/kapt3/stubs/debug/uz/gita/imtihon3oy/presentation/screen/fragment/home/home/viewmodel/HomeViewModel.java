package uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0016H&J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\tH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/home/home/viewmodel/HomeViewModel;", "", "doctorsLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "getDoctorsLiveData", "()Landroidx/lifecycle/LiveData;", "errorLiveData", "", "getErrorLiveData", "loadingLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getLoadingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "searchListLiveData", "getSearchListLiveData", "userLiveData", "Luz/gita/imtihon3oy/data/model/response/UserData;", "getUserLiveData", "changeFavoutite", "", "id", "", "getDoctors", "getUserInformations", "phone", "searchFun", "text", "app_debug"})
public abstract interface HomeViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<uz.gita.imtihon3oy.data.model.response.UserData> getUserLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity>> getDoctorsLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity>> getSearchListLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getErrorLiveData();
    
    public abstract void getDoctors();
    
    public abstract void changeFavoutite(long id);
    
    public abstract void getUserInformations(@org.jetbrains.annotations.NotNull
    java.lang.String phone);
    
    public abstract void searchFun(@org.jetbrains.annotations.NotNull
    java.lang.String text);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData();
}