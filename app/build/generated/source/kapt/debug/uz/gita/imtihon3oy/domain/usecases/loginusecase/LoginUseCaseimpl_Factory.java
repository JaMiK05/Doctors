package uz.gita.imtihon3oy.domain.usecases.loginusecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository;

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
public final class LoginUseCaseimpl_Factory implements Factory<LoginUseCaseimpl> {
  private final Provider<AuthRepository> repositoryProvider;

  public LoginUseCaseimpl_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public LoginUseCaseimpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static LoginUseCaseimpl_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new LoginUseCaseimpl_Factory(repositoryProvider);
  }

  public static LoginUseCaseimpl newInstance(AuthRepository repository) {
    return new LoginUseCaseimpl(repository);
  }
}
