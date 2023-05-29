package uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy;

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
public final class VerifyFragment_MembersInjector implements MembersInjector<VerifyFragment> {
  private final Provider<MySharedPref> sharedProvider;

  public VerifyFragment_MembersInjector(Provider<MySharedPref> sharedProvider) {
    this.sharedProvider = sharedProvider;
  }

  public static MembersInjector<VerifyFragment> create(Provider<MySharedPref> sharedProvider) {
    return new VerifyFragment_MembersInjector(sharedProvider);
  }

  @Override
  public void injectMembers(VerifyFragment instance) {
    injectShared(instance, sharedProvider.get());
  }

  @InjectedFieldSignature("uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.VerifyFragment.shared")
  public static void injectShared(VerifyFragment instance, MySharedPref shared) {
    instance.shared = shared;
  }
}
