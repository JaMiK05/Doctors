package uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCase;

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
public final class LoginViewModelimpl_Factory implements Factory<LoginViewModelimpl> {
  private final Provider<LoginUseCase> useCaseProvider;

  public LoginViewModelimpl_Factory(Provider<LoginUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public LoginViewModelimpl get() {
    return newInstance(useCaseProvider.get());
  }

  public static LoginViewModelimpl_Factory create(Provider<LoginUseCase> useCaseProvider) {
    return new LoginViewModelimpl_Factory(useCaseProvider);
  }

  public static LoginViewModelimpl newInstance(LoginUseCase useCase) {
    return new LoginViewModelimpl(useCase);
  }
}
