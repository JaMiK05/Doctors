package uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel;

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
public final class FavouriteViewModelImpl_Factory implements Factory<FavouriteViewModelImpl> {
  private final Provider<UseCase> useCaseProvider;

  public FavouriteViewModelImpl_Factory(Provider<UseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public FavouriteViewModelImpl get() {
    return newInstance(useCaseProvider.get());
  }

  public static FavouriteViewModelImpl_Factory create(Provider<UseCase> useCaseProvider) {
    return new FavouriteViewModelImpl_Factory(useCaseProvider);
  }

  public static FavouriteViewModelImpl newInstance(UseCase useCase) {
    return new FavouriteViewModelImpl(useCase);
  }
}
