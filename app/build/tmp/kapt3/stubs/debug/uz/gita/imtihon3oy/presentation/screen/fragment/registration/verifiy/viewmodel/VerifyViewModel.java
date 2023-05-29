package uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/registration/verifiy/viewmodel/VerifyViewModel;", "", "addLiveData", "Landroidx/lifecycle/LiveData;", "", "getAddLiveData", "()Landroidx/lifecycle/LiveData;", "failLiveData", "getFailLiveData", "succesLiveData", "Luz/gita/imtihon3oy/data/model/response/VerifyResponse;", "getSuccesLiveData", "addUser", "", "user", "Luz/gita/imtihon3oy/data/model/response/UserData;", "verify", "request", "Luz/gita/imtihon3oy/data/model/request/VerifyRequest;", "app_debug"})
public abstract interface VerifyViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<uz.gita.imtihon3oy.data.model.response.VerifyResponse> getSuccesLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getAddLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getFailLiveData();
    
    public abstract void verify(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.request.VerifyRequest request);
    
    public abstract void addUser(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.model.response.UserData user);
}