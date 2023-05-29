package uz.gita.imtihon3oy.domain.usecases.homeusecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.repositories.home.HomeRepository;

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
public final class UseCaseImpl_Factory implements Factory<UseCaseImpl> {
  private final Provider<HomeRepository> repositoryProvider;

  public UseCaseImpl_Factory(Provider<HomeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static UseCaseImpl_Factory create(Provider<HomeRepository> repositoryProvider) {
    return new UseCaseImpl_Factory(repositoryProvider);
  }

  public static UseCaseImpl newInstance(HomeRepository repository) {
    return new UseCaseImpl(repository);
  }
}
