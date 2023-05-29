package uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr.viewmodel.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class RegistrViewModelimpl_Factory implements Factory<RegistrViewModelimpl> {
  @Override
  public RegistrViewModelimpl get() {
    return newInstance();
  }

  public static RegistrViewModelimpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RegistrViewModelimpl newInstance() {
    return new RegistrViewModelimpl();
  }

  private static final class InstanceHolder {
    private static final RegistrViewModelimpl_Factory INSTANCE = new RegistrViewModelimpl_Factory();
  }
}
