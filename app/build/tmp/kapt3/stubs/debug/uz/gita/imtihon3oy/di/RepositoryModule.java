package uz.gita.imtihon3oy.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Luz/gita/imtihon3oy/di/RepositoryModule;", "", "bindAuthRepositoryy", "Luz/gita/imtihon3oy/domain/repositories/authrepository/AuthRepository;", "impl", "Luz/gita/imtihon3oy/domain/repositories/authrepository/impl/AuthRepositoryimpl;", "bindBookRepository", "Luz/gita/imtihon3oy/domain/repositories/home/HomeRepository;", "Luz/gita/imtihon3oy/domain/repositories/home/HomeRepositoryImpl;", "bindRepository", "Luz/gita/imtihon3oy/domain/repositories/profilrepository/ProfileRepository;", "Luz/gita/imtihon3oy/domain/repositories/profilrepository/impl/ProfileRepositoryImp;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface RepositoryModule {
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.repositories.authrepository.AuthRepository bindAuthRepositoryy(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.repositories.authrepository.impl.AuthRepositoryimpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.repositories.profilrepository.ProfileRepository bindRepository(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.repositories.profilrepository.impl.ProfileRepositoryImp impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.domain.repositories.home.HomeRepository bindBookRepository(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.domain.repositories.home.HomeRepositoryImpl impl);
}