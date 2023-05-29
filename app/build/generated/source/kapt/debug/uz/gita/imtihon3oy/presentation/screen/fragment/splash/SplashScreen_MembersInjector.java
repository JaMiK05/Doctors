package uz.gita.imtihon3oy.presentation.screen.fragment.splash;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.data.share.MySharedPref;

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
public final class SplashScreen_MembersInjector implements MembersInjector<SplashScreen> {
  private final Provider<MySharedPref> sharedProvider;

  public SplashScreen_MembersInjector(Provider<MySharedPref> sharedProvider) {
    this.sharedProvider = sharedProvider;
  }

  public static MembersInjector<SplashScreen> create(Provider<MySharedPref> sharedProvider) {
    return new SplashScreen_MembersInjector(sharedProvider);
  }

  @Override
  public void injectMembers(SplashScreen instance) {
    injectShared(instance, sharedProvider.get());
  }

  @InjectedFieldSignature("uz.gita.imtihon3oy.presentation.screen.fragment.splash.SplashScreen.shared")
  public static void injectShared(SplashScreen instance, MySharedPref shared) {
    instance.shared = shared;
  }
}
