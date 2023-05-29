package uz.gita.imtihon3oy.domain.usecases.homeusecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\nH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016\u00f8\u0001\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Luz/gita/imtihon3oy/domain/usecases/homeusecase/UseCaseImpl;", "Luz/gita/imtihon3oy/domain/usecases/homeusecase/UseCase;", "repository", "Luz/gita/imtihon3oy/domain/repositories/home/HomeRepository;", "(Luz/gita/imtihon3oy/domain/repositories/home/HomeRepository;)V", "clickedFavourite", "", "id", "", "getDoctors", "Lkotlin/Result;", "", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "getDoctors-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteDoctors", "getNews", "Luz/gita/imtihon3oy/data/model/NotifyData;", "getNews-IoAF18A", "getUserInfo", "Lkotlinx/coroutines/flow/Flow;", "Luz/gita/imtihon3oy/data/model/response/UserData;", "phone", "", "search", "like", "app_debug"})
public final class UseCaseImpl implements uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.domain.repositories.home.HomeRepository repository = null;
    
    @javax.inject.Inject
    public UseCaseImpl(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.repositories.home.HomeRepository repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.imtihon3oy.data.model.response.UserData>> getUserInfo(@org.jetbrains.annotations.NotNull
    java.lang.String phone) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> getFavouriteDoctors() {
        return null;
    }
    
    @java.lang.Override
    public void clickedFavourite(long id) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> search(@org.jetbrains.annotations.NotNull
    java.lang.String like) {
        return null;
    }
}