package uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase;

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
public final class SignViewModeImplUp_Factory implements Factory<SignViewModeImplUp> {
  private final Provider<SigninUseCase> useCaseProvider;

  public SignViewModeImplUp_Factory(Provider<SigninUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public SignViewModeImplUp get() {
    return newInstance(useCaseProvider.get());
  }

  public static SignViewModeImplUp_Factory create(Provider<SigninUseCase> useCaseProvider) {
    return new SignViewModeImplUp_Factory(useCaseProvider);
  }

  public static SignViewModeImplUp newInstance(SigninUseCase useCase) {
    return new SignViewModeImplUp(useCase);
  }
}
