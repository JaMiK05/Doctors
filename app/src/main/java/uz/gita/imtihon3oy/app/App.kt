package uz.gita.imtihon3oy.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import uz.gita.imtihon3oy.data.source.local.DoctorDatabase


@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        DoctorDatabase.init(this)
        super.onCreate()
    }

}