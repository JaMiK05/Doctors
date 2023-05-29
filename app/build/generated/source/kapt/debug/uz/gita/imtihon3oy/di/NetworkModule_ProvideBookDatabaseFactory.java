package uz.gita.imtihon3oy.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import uz.gita.imtihon3oy.data.source.local.DoctorDatabase;

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
public final class NetworkModule_ProvideBookDatabaseFactory implements Factory<DoctorDatabase> {
  private final NetworkModule module;

  public NetworkModule_ProvideBookDatabaseFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public DoctorDatabase get() {
    return provideBookDatabase(module);
  }

  public static NetworkModule_ProvideBookDatabaseFactory create(NetworkModule module) {
    return new NetworkModule_ProvideBookDatabaseFactory(module);
  }

  public static DoctorDatabase provideBookDatabase(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBookDatabase());
  }
}
