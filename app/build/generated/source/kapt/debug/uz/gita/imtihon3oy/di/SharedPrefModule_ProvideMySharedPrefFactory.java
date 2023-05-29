package uz.gita.imtihon3oy.di;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.data.share.MySharedPref;

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
public final class SharedPrefModule_ProvideMySharedPrefFactory implements Factory<MySharedPref> {
  private final SharedPrefModule module;

  private final Provider<SharedPreferences> prefProvider;

  public SharedPrefModule_ProvideMySharedPrefFactory(SharedPrefModule module,
      Provider<SharedPreferences> prefProvider) {
    this.module = module;
    this.prefProvider = prefProvider;
  }

  @Override
  public MySharedPref get() {
    return provideMySharedPref(module, prefProvider.get());
  }

  public static SharedPrefModule_ProvideMySharedPrefFactory create(SharedPrefModule module,
      Provider<SharedPreferences> prefProvider) {
    return new SharedPrefModule_ProvideMySharedPrefFactory(module, prefProvider);
  }

  public static MySharedPref provideMySharedPref(SharedPrefModule instance,
      SharedPreferences pref) {
    return Preconditions.checkNotNullFromProvides(instance.provideMySharedPref(pref));
  }
}
