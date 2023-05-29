package uz.gita.imtihon3oy.domain.repositories.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0012J\u001f\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000e0\u001b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016\u00f8\u0001\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Luz/gita/imtihon3oy/domain/repositories/home/HomeRepositoryImpl;", "Luz/gita/imtihon3oy/domain/repositories/home/HomeRepository;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "dao", "Luz/gita/imtihon3oy/data/source/local/dao/DoctorDao;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/storage/StorageReference;Luz/gita/imtihon3oy/data/source/local/dao/DoctorDao;)V", "clickedFavourite", "", "id", "", "getDoctors", "Lkotlin/Result;", "", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "getDoctors-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteDoctors", "getLikeBooks", "like", "", "getNews", "Luz/gita/imtihon3oy/data/model/NotifyData;", "getNews-IoAF18A", "getUserInfo", "Lkotlinx/coroutines/flow/Flow;", "Luz/gita/imtihon3oy/data/model/response/UserData;", "phone", "app_debug"})
public final class HomeRepositoryImpl implements uz.gita.imtihon3oy.domain.repositories.home.HomeRepository {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.storage.StorageReference storageReference = null;
    @org.jetbrains.annotations.NotNull
    private final uz.gita.imtihon3oy.data.source.local.dao.DoctorDao dao = null;
    
    @javax.inject.Inject
    public HomeRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull
    com.google.firebase.storage.StorageReference storageReference, @org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.source.local.dao.DoctorDao dao) {
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
    public java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> getLikeBooks(@org.jetbrains.annotations.NotNull
    java.lang.String like) {
        return null;
    }
}