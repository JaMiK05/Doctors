package uz.gita.imtihon3oy.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository
import uz.gita.imtihon3oy.domain.repositories.authrepository.impl.AuthRepositoryimpl
import uz.gita.imtihon3oy.domain.repositories.home.HomeRepository
import uz.gita.imtihon3oy.domain.repositories.home.HomeRepositoryImpl
import uz.gita.imtihon3oy.domain.repositories.profilrepository.ProfileRepository
import uz.gita.imtihon3oy.domain.repositories.profilrepository.impl.ProfileRepositoryImp
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun bindAuthRepositoryy(impl: AuthRepositoryimpl): AuthRepository

    @[Binds Singleton]
    fun bindRepository(impl: ProfileRepositoryImp): ProfileRepository

    @[Binds Singleton]
    fun bindBookRepository(impl: HomeRepositoryImpl): HomeRepository


}