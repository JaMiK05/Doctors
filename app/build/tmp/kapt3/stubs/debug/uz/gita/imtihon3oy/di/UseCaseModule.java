package uz.gita.imtihon3oy.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Luz/gita/imtihon3oy/di/UseCaseModule;", "", "bindHomeUseCase", "Luz/gita/imtihon3oy/domain/usecases/homeusecase/UseCase;", "impl", "Luz/gita/imtihon3oy/domain/usecases/homeusecase/UseCaseImpl;", "bindLoginUseCase", "Luz/gita/imtihon3oy/domain/usecases/loginusecase/LoginUseCase;", "Luz/gita/imtihon3oy/domain/usecases/loginusecase/LoginUseCaseimpl;", "bindProfileUseCase", "Luz/gita/imtihon3oy/domain/usecases/profilusecase/ProfileUseCase;", "Luz/gita/imtihon3oy/domain/usecases/profilusecase/impl/ProfileUseCaseImpl;", "bindSignInUseCase", "Luz/gita/imtihon3oy/domain/usecases/signinusecase/SigninUseCase;", "Luz/gita/imtihon3oy/domain/usecases/signinusecase/SignInUseCaseimpl;", "bindVerifyUseCase", "Luz/gita/imtihon3oy/domain/usecases/verifyusecase/VerifyUseCase;", "Luz/gita/imtihon3oy/domain/usecases/verifyusecase/VerifyUseCaseimpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface UseCaseModule {
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase bindSignInUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.signinusecase.SignInUseCaseimpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCase bindVerifyUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCaseimpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCase bindLoginUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCaseimpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase bindProfileUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.profilusecase.impl.ProfileUseCaseImpl impl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase bindHomeUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCaseImpl impl);
}