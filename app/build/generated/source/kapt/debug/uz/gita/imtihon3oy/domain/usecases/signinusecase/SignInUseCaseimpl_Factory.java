package uz.gita.imtihon3oy.domain.usecases.signinusecase;

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
public final class SignInUseCaseimpl_Factory implements Factory<SignInUseCaseimpl> {
  private final Provider<AuthRepository> repositoryProvider;

  public SignInUseCaseimpl_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SignInUseCaseimpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static SignInUseCaseimpl_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new SignInUseCaseimpl_Factory(repositoryProvider);
  }

  public static SignInUseCaseimpl newInstance(AuthRepository repository) {
    return new SignInUseCaseimpl(repository);
  }
}
