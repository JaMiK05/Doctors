package uz.gita.imtihon3oy.di;

import com.google.firebase.firestore.FirebaseFirestore;
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
public final class NetworkModule_ProvideFireDataBaseFactory implements Factory<FirebaseFirestore> {
  private final NetworkModule module;

  public NetworkModule_ProvideFireDataBaseFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public FirebaseFirestore get() {
    return provideFireDataBase(module);
  }

  public static NetworkModule_ProvideFireDataBaseFactory create(NetworkModule module) {
    return new NetworkModule_ProvideFireDataBaseFactory(module);
  }

  public static FirebaseFirestore provideFireDataBase(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFireDataBase());
  }
}
