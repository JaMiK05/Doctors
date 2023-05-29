package uz.gita.imtihon3oy.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.ktx.storage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.gita.imtihon3oy.data.source.local.DoctorDatabase
import uz.gita.imtihon3oy.data.source.local.dao.DoctorDao
import uz.gita.imtihon3oy.data.source.remote.api.AuthApi
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    private val baseUrl = "https://0c24-195-158-16-140.ngrok-free.app"

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .baseUrl(baseUrl)
        .build()

    @Provides
    @Singleton
    fun provideClient(@ApplicationContext context: Context): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(ChuckerInterceptor.Builder(context).build())
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthApi(retrofit: Retrofit): AuthApi = retrofit.create(AuthApi::class.java)


    @Provides
    @Singleton
    fun provideFireStorage(): StorageReference = Firebase.storage.reference

    @Provides
    @Singleton
    fun provideFireDataBase(): FirebaseFirestore = Firebase.firestore


    @Provides
    @Singleton
    fun provideBookDatabase(): DoctorDatabase = DoctorDatabase.getInstance()

    @Provides
    @Singleton
    fun provideDao(db: DoctorDatabase): DoctorDao = db.getDoctorDao()

}