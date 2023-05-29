package uz.gita.imtihon3oy.presentation.screen.fragment.registration.login;

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
public final class LoginFragment_MembersInjector implements MembersInjector<LoginFragment> {
  private final Provider<MySharedPref> shared1Provider;

  public LoginFragment_MembersInjector(Provider<MySharedPref> shared1Provider) {
    this.shared1Provider = shared1Provider;
  }

  public static MembersInjector<LoginFragment> create(Provider<MySharedPref> shared1Provider) {
    return new LoginFragment_MembersInjector(shared1Provider);
  }

  @Override
  public void injectMembers(LoginFragment instance) {
    injectShared1(instance, shared1Provider.get());
  }

  @InjectedFieldSignature("uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.LoginFragment.shared1")
  public static void injectShared1(LoginFragment instance, MySharedPref shared1) {
    instance.shared1 = shared1;
  }
}
