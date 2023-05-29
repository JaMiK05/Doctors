package uz.gita.imtihon3oy.domain.repositories.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\u000fH&J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u0007H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0012\u0010\u000bJ\u001f\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00142\u0006\u0010\u0016\u001a\u00020\u000fH&\u00f8\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Luz/gita/imtihon3oy/domain/repositories/home/HomeRepository;", "", "clickedFavourite", "", "id", "", "getDoctors", "Lkotlin/Result;", "", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "getDoctors-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteDoctors", "getLikeBooks", "like", "", "getNews", "Luz/gita/imtihon3oy/data/model/NotifyData;", "getNews-IoAF18A", "getUserInfo", "Lkotlinx/coroutines/flow/Flow;", "Luz/gita/imtihon3oy/data/model/response/UserData;", "phone", "app_debug"})
public abstract interface HomeRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.imtihon3oy.data.model.response.UserData>> getUserInfo(@org.jetbrains.annotations.NotNull
    java.lang.String phone);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> getFavouriteDoctors();
    
    public abstract void clickedFavourite(long id);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> getLikeBooks(@org.jetbrains.annotations.NotNull
    java.lang.String like);
}