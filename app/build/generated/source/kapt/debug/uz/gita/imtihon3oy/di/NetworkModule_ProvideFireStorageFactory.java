package uz.gita.imtihon3oy.di;

import com.google.firebase.storage.StorageReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideFireStorageFactory implements Factory<StorageReference> {
  private final NetworkModule module;

  public NetworkModule_ProvideFireStorageFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public StorageReference get() {
    return provideFireStorage(module);
  }

  public static NetworkModule_ProvideFireStorageFactory create(NetworkModule module) {
    return new NetworkModule_ProvideFireStorageFactory(module);
  }

  public static StorageReference provideFireStorage(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFireStorage());
  }
}
