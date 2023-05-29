package uz.gita.imtihon3oy.domain.usecases.verifyusecase;

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
public final class VerifyUseCaseimpl_Factory implements Factory<VerifyUseCaseimpl> {
  private final Provider<AuthRepository> repositoryProvider;

  public VerifyUseCaseimpl_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public VerifyUseCaseimpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static VerifyUseCaseimpl_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new VerifyUseCaseimpl_Factory(repositoryProvider);
  }

  public static VerifyUseCaseimpl newInstance(AuthRepository repository) {
    return new VerifyUseCaseimpl(repository);
  }
}
