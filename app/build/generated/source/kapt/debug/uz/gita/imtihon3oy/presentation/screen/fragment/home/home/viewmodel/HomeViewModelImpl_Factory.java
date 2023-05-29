package uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase;

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
public final class HomeViewModelImpl_Factory implements Factory<HomeViewModelImpl> {
  private final Provider<UseCase> useCaseProvider;

  public HomeViewModelImpl_Factory(Provider<UseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public HomeViewModelImpl get() {
    return newInstance(useCaseProvider.get());
  }

  public static HomeViewModelImpl_Factory create(Provider<UseCase> useCaseProvider) {
    return new HomeViewModelImpl_Factory(useCaseProvider);
  }

  public static HomeViewModelImpl newInstance(UseCase useCase) {
    return new HomeViewModelImpl(useCase);
  }
}
