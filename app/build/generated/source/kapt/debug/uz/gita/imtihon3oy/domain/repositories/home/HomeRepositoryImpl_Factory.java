package uz.gita.imtihon3oy.domain.repositories.home;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.data.source.local.dao.DoctorDao;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeRepositoryImpl_Factory implements Factory<HomeRepositoryImpl> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<StorageReference> storageReferenceProvider;

  private final Provider<DoctorDao> daoProvider;

  public HomeRepositoryImpl_Factory(Provider<FirebaseFirestore> firestoreProvider,
      Provider<StorageReference> storageReferenceProvider, Provider<DoctorDao> daoProvider) {
    this.firestoreProvider = firestoreProvider;
    this.storageReferenceProvider = storageReferenceProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public HomeRepositoryImpl get() {
    return newInstance(firestoreProvider.get(), storageReferenceProvider.get(), daoProvider.get());
  }

  public static HomeRepositoryImpl_Factory create(Provider<FirebaseFirestore> firestoreProvider,
      Provider<StorageReference> storageReferenceProvider, Provider<DoctorDao> daoProvider) {
    return new HomeRepositoryImpl_Factory(firestoreProvider, storageReferenceProvider, daoProvider);
  }

  public static HomeRepositoryImpl newInstance(FirebaseFirestore firestore,
      StorageReference storageReference, DoctorDao dao) {
    return new HomeRepositoryImpl(firestore, storageReference, dao);
  }
}
