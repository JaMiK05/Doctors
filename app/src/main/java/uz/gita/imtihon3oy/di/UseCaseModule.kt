package uz.gita.imtihon3oy.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCase
import uz.gita.imtihon3oy.domain.usecases.homeusecase.UseCaseImpl
import uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCase
import uz.gita.imtihon3oy.domain.usecases.loginusecase.LoginUseCaseimpl
import uz.gita.imtihon3oy.domain.usecases.profilusecase.ProfileUseCase
import uz.gita.imtihon3oy.domain.usecases.profilusecase.impl.ProfileUseCaseImpl
import uz.gita.imtihon3oy.domain.usecases.signinusecase.SignInUseCaseimpl
import uz.gita.imtihon3oy.domain.usecases.signinusecase.SigninUseCase
import uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCase
import uz.gita.imtihon3oy.domain.usecases.verifyusecase.VerifyUseCaseimpl
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface UseCaseModule {


    @[Binds Singleton]
    fun bindSignInUseCase(impl: SignInUseCaseimpl): SigninUseCase

    @[Binds Singleton]
    fun bindVerifyUseCase(impl: VerifyUseCaseimpl): VerifyUseCase

    @[Binds Singleton]
    fun bindLoginUseCase(impl: LoginUseCaseimpl): LoginUseCase

    @[Binds Singleton]
    fun bindProfileUseCase(impl: ProfileUseCaseImpl): ProfileUseCase

    @Binds
    fun bindHomeUseCase(impl: UseCaseImpl): UseCase

}