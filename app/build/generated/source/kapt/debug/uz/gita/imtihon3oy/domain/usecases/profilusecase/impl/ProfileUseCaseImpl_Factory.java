package uz.gita.imtihon3oy.domain.usecases.profilusecase.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.domain.repositories.profilrepository.ProfileRepository;

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
public final class ProfileUseCaseImpl_Factory implements Factory<ProfileUseCaseImpl> {
  private final Provider<ProfileRepository> repositoryProvider;

  public ProfileUseCaseImpl_Factory(Provider<ProfileRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ProfileUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static ProfileUseCaseImpl_Factory create(Provider<ProfileRepository> repositoryProvider) {
    return new ProfileUseCaseImpl_Factory(repositoryProvider);
  }

  public static ProfileUseCaseImpl newInstance(ProfileRepository repository) {
    return new ProfileUseCaseImpl(repository);
  }
}
