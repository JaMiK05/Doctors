package uz.gita.imtihon3oy.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class SharedPrefModule_ProvideSharedPrefFactory implements Factory<SharedPreferences> {
  private final SharedPrefModule module;

  private final Provider<Context> contextProvider;

  public SharedPrefModule_ProvideSharedPrefFactory(SharedPrefModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPref(module, contextProvider.get());
  }

  public static SharedPrefModule_ProvideSharedPrefFactory create(SharedPrefModule module,
      Provider<Context> contextProvider) {
    return new SharedPrefModule_ProvideSharedPrefFactory(module, contextProvider);
  }

  public static SharedPreferences provideSharedPref(SharedPrefModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideSharedPref(context));
  }
}
