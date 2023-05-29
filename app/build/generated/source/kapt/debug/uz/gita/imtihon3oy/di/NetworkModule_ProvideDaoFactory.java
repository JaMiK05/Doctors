package uz.gita.imtihon3oy.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.data.source.local.DoctorDatabase;
import uz.gita.imtihon3oy.data.source.local.dao.DoctorDao;

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
public final class NetworkModule_ProvideDaoFactory implements Factory<DoctorDao> {
  private final NetworkModule module;

  private final Provider<DoctorDatabase> dbProvider;

  public NetworkModule_ProvideDaoFactory(NetworkModule module,
      Provider<DoctorDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public DoctorDao get() {
    return provideDao(module, dbProvider.get());
  }

  public static NetworkModule_ProvideDaoFactory create(NetworkModule module,
      Provider<DoctorDatabase> dbProvider) {
    return new NetworkModule_ProvideDaoFactory(module, dbProvider);
  }

  public static DoctorDao provideDao(NetworkModule instance, DoctorDatabase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideDao(db));
  }
}
