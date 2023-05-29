package uz.gita.imtihon3oy.data.share;

import android.content.SharedPreferences;
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
public final class MySharedPref_Factory implements Factory<MySharedPref> {
  private final Provider<SharedPreferences> prefProvider;

  public MySharedPref_Factory(Provider<SharedPreferences> prefProvider) {
    this.prefProvider = prefProvider;
  }

  @Override
  public MySharedPref get() {
    return newInstance(prefProvider.get());
  }

  public static MySharedPref_Factory create(Provider<SharedPreferences> prefProvider) {
    return new MySharedPref_Factory(prefProvider);
  }

  public static MySharedPref newInstance(SharedPreferences pref) {
    return new MySharedPref(pref);
  }
}
