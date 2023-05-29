package uz.gita.imtihon3oy.domain.repositories.authrepository.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.data.source.remote.api.AuthApi;

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
public final class AuthRepositoryimpl_Factory implements Factory<AuthRepositoryimpl> {
  private final Provider<AuthApi> authApiProvider;

  public AuthRepositoryimpl_Factory(Provider<AuthApi> authApiProvider) {
    this.authApiProvider = authApiProvider;
  }

  @Override
  public AuthRepositoryimpl get() {
    return newInstance(authApiProvider.get());
  }

  public static AuthRepositoryimpl_Factory create(Provider<AuthApi> authApiProvider) {
    return new AuthRepositoryimpl_Factory(authApiProvider);
  }

  public static AuthRepositoryimpl newInstance(AuthApi authApi) {
    return new AuthRepositoryimpl(authApi);
  }
}
