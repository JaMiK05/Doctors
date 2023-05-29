package uz.gita.imtihon3oy.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideClientFactory(NetworkModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideClient(module, contextProvider.get());
  }

  public static NetworkModule_ProvideClientFactory create(NetworkModule module,
      Provider<Context> contextProvider) {
    return new NetworkModule_ProvideClientFactory(module, contextProvider);
  }

  public static OkHttpClient provideClient(NetworkModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideClient(context));
  }
}
