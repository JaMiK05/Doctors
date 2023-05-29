package uz.gita.imtihon3oy.app;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import uz.gita.imtihon3oy.data.share.MySharedPref;
import uz.gita.imtihon3oy.data.source.local.DoctorDatabase;
import uz.gita.imtihon3oy.data.source.local.dao.DoctorDao;
import uz.gita.imtihon3oy.data.source.remote.api.AuthApi;
import uz.gita.imtihon3oy.di.NetworkModule;
import uz.gita.imtihon3oy.di.NetworkModule_ProvideAuthApiFactory;
import uz.gita.imtihon3oy.di.NetworkModule_ProvideBookDatabaseFactory;
import uz.gita.imtihon3oy.di.NetworkModule_ProvideClientFactory;
import uz.gita.imtihon3oy.di.NetworkModule_ProvideDaoFactory;
import uz.gita.imtihon3oy.di.NetworkModule_ProvideFireDataBaseFactory;
import uz.gita.imtihon3oy.di.NetworkModule_ProvideFireStorageFactory;
import uz.gita.imtihon3oy.di.NetworkModule_ProvideRetrofitFactory;
import uz.gita.imtihon3oy.di.SharedPrefModule;
import uz.gita.imtihon3oy.di.SharedPrefModule_ProvideMySharedPrefFactory;
import uz.gita.imtihon3oy.di.SharedPrefModule_ProvideSharedPrefFactory;
import uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository;
import uz.gita.imtihon3oy.domain.repositories.authrepository.impl.AuthRepositoryimpl;
import uz.gita.imtihon3oy.domain.repositories.home.HomeRepository;
import uz.gita.imtihon3oy.domain.repositories.home.HomeRepositoryImpl;
import uz.gita.imtihon3oy.domain.repositories.profilrepository.ProfileRepository;
import uz.gita.imtihon3oy.domain.repositories.profilrepository.impl.ProfileRepositoryImp;
import uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCaseImpl;
import uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCase;
import uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCaseimpl;
import uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase;
import uz.gita.imtihon3oy.domain.usecases.profilusecase.impl.ProfileUseCaseImpl;
import uz.gita.imtihon3oy.domain.usecases.signinusecase.SignInUseCaseimpl;
import uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase;
import uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCase;
import uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCaseimpl;
import uz.gita.imtihon3oy.presentation.screen.activity.MainActivity;
import uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.ProfileScreen;
import uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel.ProfileViewModelImpl;
import uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel.ProfileViewModelImpl_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.FavouriteScreen;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel.FavouriteViewModelImpl;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel.FavouriteViewModelImpl_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.home.HomeScreen;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel.HomeViewModelImpl;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel.HomeViewModelImpl_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.NotificationScreen;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel.NotifyViewModelImpl;
import uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel.NotifyViewModelImpl_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.main.MainFragment;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.LoginFragment;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.LoginFragment_MembersInjector;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.impl.LoginViewModelimpl;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.impl.LoginViewModelimpl_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr.RegistrFragment;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr.viewmodel.impl.RegistrViewModelimpl;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr.viewmodel.impl.RegistrViewModelimpl_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.SignUpFragment;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl.SignViewModeImplUp;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl.SignViewModeImplUp_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.VerifyFragment;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.VerifyFragment_MembersInjector;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.impl.VerifyViewModelimpl;
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.impl.VerifyViewModelimpl_HiltModules_KeyModule_ProvideFactory;
import uz.gita.imtihon3oy.presentation.screen.fragment.splash.SplashScreen;
import uz.gita.imtihon3oy.presentation.screen.fragment.splash.SplashScreen_MembersInjector;
import uz.gita.imtihon3oy.presentation.screen.fragment.viewpager.ViewPagerScreen;
import uz.gita.imtihon3oy.presentation.screen.fragment.viewpager.ViewPagerScreen_MembersInjector;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC {
  private DaggerApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private NetworkModule networkModule;

    private SharedPrefModule sharedPrefModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder sharedPrefModule(SharedPrefModule sharedPrefModule) {
      this.sharedPrefModule = Preconditions.checkNotNull(sharedPrefModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (sharedPrefModule == null) {
        this.sharedPrefModule = new SharedPrefModule();
      }
      return new SingletonCImpl(applicationContextModule, networkModule, sharedPrefModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @Override
    public void injectProfileScreen(ProfileScreen profileScreen) {
    }

    @Override
    public void injectFavouriteScreen(FavouriteScreen favouriteScreen) {
    }

    @Override
    public void injectHomeScreen(HomeScreen homeScreen) {
    }

    @Override
    public void injectNotificationScreen(NotificationScreen notificationScreen) {
    }

    @Override
    public void injectMainFragment(MainFragment mainFragment) {
    }

    @Override
    public void injectLoginFragment(LoginFragment loginFragment) {
      injectLoginFragment2(loginFragment);
    }

    @Override
    public void injectRegistrFragment(RegistrFragment registrFragment) {
    }

    @Override
    public void injectSignUpFragment(SignUpFragment signUpFragment) {
    }

    @Override
    public void injectVerifyFragment(VerifyFragment verifyFragment) {
      injectVerifyFragment2(verifyFragment);
    }

    @Override
    public void injectSplashScreen(SplashScreen splashScreen) {
      injectSplashScreen2(splashScreen);
    }

    @Override
    public void injectViewPagerScreen(ViewPagerScreen viewPagerScreen) {
      injectViewPagerScreen2(viewPagerScreen);
    }

    @CanIgnoreReturnValue
    private LoginFragment injectLoginFragment2(LoginFragment instance) {
      LoginFragment_MembersInjector.injectShared1(instance, singletonCImpl.provideMySharedPrefProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private VerifyFragment injectVerifyFragment2(VerifyFragment instance) {
      VerifyFragment_MembersInjector.injectShared(instance, singletonCImpl.provideMySharedPrefProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private SplashScreen injectSplashScreen2(SplashScreen instance) {
      SplashScreen_MembersInjector.injectShared(instance, singletonCImpl.provideMySharedPrefProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ViewPagerScreen injectViewPagerScreen2(ViewPagerScreen instance) {
      ViewPagerScreen_MembersInjector.injectShared(instance, singletonCImpl.provideMySharedPrefProvider.get());
      return instance;
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(FavouriteViewModelImpl_HiltModules_KeyModule_ProvideFactory.provide(), HomeViewModelImpl_HiltModules_KeyModule_ProvideFactory.provide(), LoginViewModelimpl_HiltModules_KeyModule_ProvideFactory.provide(), NotifyViewModelImpl_HiltModules_KeyModule_ProvideFactory.provide(), ProfileViewModelImpl_HiltModules_KeyModule_ProvideFactory.provide(), RegistrViewModelimpl_HiltModules_KeyModule_ProvideFactory.provide(), SignViewModeImplUp_HiltModules_KeyModule_ProvideFactory.provide(), VerifyViewModelimpl_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<FavouriteViewModelImpl> favouriteViewModelImplProvider;

    private Provider<HomeViewModelImpl> homeViewModelImplProvider;

    private Provider<LoginViewModelimpl> loginViewModelimplProvider;

    private Provider<NotifyViewModelImpl> notifyViewModelImplProvider;

    private Provider<ProfileViewModelImpl> profileViewModelImplProvider;

    private Provider<RegistrViewModelimpl> registrViewModelimplProvider;

    private Provider<SignViewModeImplUp> signViewModeImplUpProvider;

    private Provider<VerifyViewModelimpl> verifyViewModelimplProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.favouriteViewModelImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.homeViewModelImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.loginViewModelimplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.notifyViewModelImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.profileViewModelImplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.registrViewModelimplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.signViewModeImplUpProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.verifyViewModelimplProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(8).put("uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel.FavouriteViewModelImpl", ((Provider) favouriteViewModelImplProvider)).put("uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel.HomeViewModelImpl", ((Provider) homeViewModelImplProvider)).put("uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.impl.LoginViewModelimpl", ((Provider) loginViewModelimplProvider)).put("uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel.NotifyViewModelImpl", ((Provider) notifyViewModelImplProvider)).put("uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel.ProfileViewModelImpl", ((Provider) profileViewModelImplProvider)).put("uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr.viewmodel.impl.RegistrViewModelimpl", ((Provider) registrViewModelimplProvider)).put("uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl.SignViewModeImplUp", ((Provider) signViewModeImplUpProvider)).put("uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.impl.VerifyViewModelimpl", ((Provider) verifyViewModelimplProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel.FavouriteViewModelImpl 
          return (T) new FavouriteViewModelImpl(singletonCImpl.useCaseImpl());

          case 1: // uz.gita.imtihon3oy.presentation.screen.fragment.home.home.viewmodel.HomeViewModelImpl 
          return (T) new HomeViewModelImpl(singletonCImpl.useCaseImpl());

          case 2: // uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.impl.LoginViewModelimpl 
          return (T) new LoginViewModelimpl(singletonCImpl.bindLoginUseCaseProvider.get());

          case 3: // uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel.NotifyViewModelImpl 
          return (T) new NotifyViewModelImpl(singletonCImpl.useCaseImpl());

          case 4: // uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel.ProfileViewModelImpl 
          return (T) new ProfileViewModelImpl(singletonCImpl.bindProfileUseCaseProvider.get());

          case 5: // uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr.viewmodel.impl.RegistrViewModelimpl 
          return (T) new RegistrViewModelimpl();

          case 6: // uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl.SignViewModeImplUp 
          return (T) new SignViewModeImplUp(singletonCImpl.bindSignInUseCaseProvider.get());

          case 7: // uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.impl.VerifyViewModelimpl 
          return (T) new VerifyViewModelimpl(singletonCImpl.bindVerifyUseCaseProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends App_HiltComponents.SingletonC {
    private final SharedPrefModule sharedPrefModule;

    private final ApplicationContextModule applicationContextModule;

    private final NetworkModule networkModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<SharedPreferences> provideSharedPrefProvider;

    private Provider<MySharedPref> provideMySharedPrefProvider;

    private Provider<FirebaseFirestore> provideFireDataBaseProvider;

    private Provider<StorageReference> provideFireStorageProvider;

    private Provider<DoctorDatabase> provideBookDatabaseProvider;

    private Provider<DoctorDao> provideDaoProvider;

    private Provider<HomeRepositoryImpl> homeRepositoryImplProvider;

    private Provider<HomeRepository> bindBookRepositoryProvider;

    private Provider<OkHttpClient> provideClientProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<AuthApi> provideAuthApiProvider;

    private Provider<AuthRepositoryimpl> authRepositoryimplProvider;

    private Provider<AuthRepository> bindAuthRepositoryyProvider;

    private Provider<LoginUseCaseimpl> loginUseCaseimplProvider;

    private Provider<LoginUseCase> bindLoginUseCaseProvider;

    private Provider<ProfileRepositoryImp> profileRepositoryImpProvider;

    private Provider<ProfileRepository> bindRepositoryProvider;

    private Provider<ProfileUseCaseImpl> profileUseCaseImplProvider;

    private Provider<ProfileUseCase> bindProfileUseCaseProvider;

    private Provider<SignInUseCaseimpl> signInUseCaseimplProvider;

    private Provider<SigninUseCase> bindSignInUseCaseProvider;

    private Provider<VerifyUseCaseimpl> verifyUseCaseimplProvider;

    private Provider<VerifyUseCase> bindVerifyUseCaseProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        NetworkModule networkModuleParam, SharedPrefModule sharedPrefModuleParam) {
      this.sharedPrefModule = sharedPrefModuleParam;
      this.applicationContextModule = applicationContextModuleParam;
      this.networkModule = networkModuleParam;
      initialize(applicationContextModuleParam, networkModuleParam, sharedPrefModuleParam);

    }

    private UseCaseImpl useCaseImpl() {
      return new UseCaseImpl(bindBookRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final NetworkModule networkModuleParam, final SharedPrefModule sharedPrefModuleParam) {
      this.provideSharedPrefProvider = DoubleCheck.provider(new SwitchingProvider<SharedPreferences>(singletonCImpl, 1));
      this.provideMySharedPrefProvider = DoubleCheck.provider(new SwitchingProvider<MySharedPref>(singletonCImpl, 0));
      this.provideFireDataBaseProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseFirestore>(singletonCImpl, 3));
      this.provideFireStorageProvider = DoubleCheck.provider(new SwitchingProvider<StorageReference>(singletonCImpl, 4));
      this.provideBookDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<DoctorDatabase>(singletonCImpl, 6));
      this.provideDaoProvider = DoubleCheck.provider(new SwitchingProvider<DoctorDao>(singletonCImpl, 5));
      this.homeRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 2);
      this.bindBookRepositoryProvider = DoubleCheck.provider((Provider) homeRepositoryImplProvider);
      this.provideClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 11));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 10));
      this.provideAuthApiProvider = DoubleCheck.provider(new SwitchingProvider<AuthApi>(singletonCImpl, 9));
      this.authRepositoryimplProvider = new SwitchingProvider<>(singletonCImpl, 8);
      this.bindAuthRepositoryyProvider = DoubleCheck.provider((Provider) authRepositoryimplProvider);
      this.loginUseCaseimplProvider = new SwitchingProvider<>(singletonCImpl, 7);
      this.bindLoginUseCaseProvider = DoubleCheck.provider((Provider) loginUseCaseimplProvider);
      this.profileRepositoryImpProvider = new SwitchingProvider<>(singletonCImpl, 13);
      this.bindRepositoryProvider = DoubleCheck.provider((Provider) profileRepositoryImpProvider);
      this.profileUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 12);
      this.bindProfileUseCaseProvider = DoubleCheck.provider((Provider) profileUseCaseImplProvider);
      this.signInUseCaseimplProvider = new SwitchingProvider<>(singletonCImpl, 14);
      this.bindSignInUseCaseProvider = DoubleCheck.provider((Provider) signInUseCaseimplProvider);
      this.verifyUseCaseimplProvider = new SwitchingProvider<>(singletonCImpl, 15);
      this.bindVerifyUseCaseProvider = DoubleCheck.provider((Provider) verifyUseCaseimplProvider);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectApp(App app) {
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // uz.gita.imtihon3oy.data.share.MySharedPref 
          return (T) SharedPrefModule_ProvideMySharedPrefFactory.provideMySharedPref(singletonCImpl.sharedPrefModule, singletonCImpl.provideSharedPrefProvider.get());

          case 1: // android.content.SharedPreferences 
          return (T) SharedPrefModule_ProvideSharedPrefFactory.provideSharedPref(singletonCImpl.sharedPrefModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 2: // uz.gita.imtihon3oy.domain.repositories.home.HomeRepositoryImpl 
          return (T) new HomeRepositoryImpl(singletonCImpl.provideFireDataBaseProvider.get(), singletonCImpl.provideFireStorageProvider.get(), singletonCImpl.provideDaoProvider.get());

          case 3: // com.google.firebase.firestore.FirebaseFirestore 
          return (T) NetworkModule_ProvideFireDataBaseFactory.provideFireDataBase(singletonCImpl.networkModule);

          case 4: // com.google.firebase.storage.StorageReference 
          return (T) NetworkModule_ProvideFireStorageFactory.provideFireStorage(singletonCImpl.networkModule);

          case 5: // uz.gita.imtihon3oy.data.source.local.dao.DoctorDao 
          return (T) NetworkModule_ProvideDaoFactory.provideDao(singletonCImpl.networkModule, singletonCImpl.provideBookDatabaseProvider.get());

          case 6: // uz.gita.imtihon3oy.data.source.local.DoctorDatabase 
          return (T) NetworkModule_ProvideBookDatabaseFactory.provideBookDatabase(singletonCImpl.networkModule);

          case 7: // uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCaseimpl 
          return (T) new LoginUseCaseimpl(singletonCImpl.bindAuthRepositoryyProvider.get());

          case 8: // uz.gita.imtihon3oy.domain.repositories.authrepository.impl.AuthRepositoryimpl 
          return (T) new AuthRepositoryimpl(singletonCImpl.provideAuthApiProvider.get());

          case 9: // uz.gita.imtihon3oy.data.source.remote.api.AuthApi 
          return (T) NetworkModule_ProvideAuthApiFactory.provideAuthApi(singletonCImpl.networkModule, singletonCImpl.provideRetrofitProvider.get());

          case 10: // retrofit2.Retrofit 
          return (T) NetworkModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.networkModule, singletonCImpl.provideClientProvider.get());

          case 11: // okhttp3.OkHttpClient 
          return (T) NetworkModule_ProvideClientFactory.provideClient(singletonCImpl.networkModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 12: // uz.gita.imtihon3oy.domain.usecases.profilusecase.impl.ProfileUseCaseImpl 
          return (T) new ProfileUseCaseImpl(singletonCImpl.bindRepositoryProvider.get());

          case 13: // uz.gita.imtihon3oy.domain.repositories.profilrepository.impl.ProfileRepositoryImp 
          return (T) new ProfileRepositoryImp(singletonCImpl.provideFireDataBaseProvider.get(), singletonCImpl.provideFireStorageProvider.get());

          case 14: // uz.gita.imtihon3oy.domain.usecases.signinusecase.SignInUseCaseimpl 
          return (T) new SignInUseCaseimpl(singletonCImpl.bindAuthRepositoryyProvider.get());

          case 15: // uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCaseimpl 
          return (T) new VerifyUseCaseimpl(singletonCImpl.bindAuthRepositoryyProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
