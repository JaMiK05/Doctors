package uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel;

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
public final class NotifyViewModelImpl_Factory implements Factory<NotifyViewModelImpl> {
  private final Provider<UseCase> useCaseProvider;

  public NotifyViewModelImpl_Factory(Provider<UseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public NotifyViewModelImpl get() {
    return newInstance(useCaseProvider.get());
  }

  public static NotifyViewModelImpl_Factory create(Provider<UseCase> useCaseProvider) {
    return new NotifyViewModelImpl_Factory(useCaseProvider);
  }

  public static NotifyViewModelImpl newInstance(UseCase useCase) {
    return new NotifyViewModelImpl(useCase);
  }
}
