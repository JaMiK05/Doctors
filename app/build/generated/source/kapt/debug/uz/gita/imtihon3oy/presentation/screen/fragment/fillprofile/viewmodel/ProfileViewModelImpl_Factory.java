package uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase;

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
public final class ProfileViewModelImpl_Factory implements Factory<ProfileViewModelImpl> {
  private final Provider<ProfileUseCase> useCaseProvider;

  public ProfileViewModelImpl_Factory(Provider<ProfileUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public ProfileViewModelImpl get() {
    return newInstance(useCaseProvider.get());
  }

  public static ProfileViewModelImpl_Factory create(Provider<ProfileUseCase> useCaseProvider) {
    return new ProfileViewModelImpl_Factory(useCaseProvider);
  }

  public static ProfileViewModelImpl newInstance(ProfileUseCase useCase) {
    return new ProfileViewModelImpl(useCase);
  }
}
