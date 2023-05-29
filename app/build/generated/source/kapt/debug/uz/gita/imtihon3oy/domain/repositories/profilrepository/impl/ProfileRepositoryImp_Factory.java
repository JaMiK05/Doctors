package uz.gita.imtihon3oy.domain.repositories.profilrepository.impl;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ProfileRepositoryImp_Factory implements Factory<ProfileRepositoryImp> {
  private final Provider<FirebaseFirestore> fireStoreProvider;

  private final Provider<StorageReference> storageReferenceProvider;

  public ProfileRepositoryImp_Factory(Provider<FirebaseFirestore> fireStoreProvider,
      Provider<StorageReference> storageReferenceProvider) {
    this.fireStoreProvider = fireStoreProvider;
    this.storageReferenceProvider = storageReferenceProvider;
  }

  @Override
  public ProfileRepositoryImp get() {
    return newInstance(fireStoreProvider.get(), storageReferenceProvider.get());
  }

  public static ProfileRepositoryImp_Factory create(Provider<FirebaseFirestore> fireStoreProvider,
      Provider<StorageReference> storageReferenceProvider) {
    return new ProfileRepositoryImp_Factory(fireStoreProvider, storageReferenceProvider);
  }

  public static ProfileRepositoryImp newInstance(FirebaseFirestore fireStore,
      StorageReference storageReference) {
    return new ProfileRepositoryImp(fireStore, storageReference);
  }
}
