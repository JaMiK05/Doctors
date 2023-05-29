package uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCase;

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
public final class VerifyViewModelimpl_Factory implements Factory<VerifyViewModelimpl> {
  private final Provider<VerifyUseCase> verifyUseCaseProvider;

  public VerifyViewModelimpl_Factory(Provider<VerifyUseCase> verifyUseCaseProvider) {
    this.verifyUseCaseProvider = verifyUseCaseProvider;
  }

  @Override
  public VerifyViewModelimpl get() {
    return newInstance(verifyUseCaseProvider.get());
  }

  public static VerifyViewModelimpl_Factory create(Provider<VerifyUseCase> verifyUseCaseProvider) {
    return new VerifyViewModelimpl_Factory(verifyUseCaseProvider);
  }

  public static VerifyViewModelimpl newInstance(VerifyUseCase verifyUseCase) {
    return new VerifyViewModelimpl(verifyUseCase);
  }
}
