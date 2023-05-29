package uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0010\u001a\u00020\u0011H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/home/notification/viewmodel/NotifyViewModel;", "", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingLiveData", "", "getLoadingLiveData", "notifyLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/imtihon3oy/data/model/NotifyData;", "getNotifyLiveData", "()Landroidx/lifecycle/LiveData;", "getNews", "", "app_debug"})
public abstract interface NotifyViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.imtihon3oy.data.model.NotifyData>> getNotifyLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData();
    
    public abstract void getNews();
}