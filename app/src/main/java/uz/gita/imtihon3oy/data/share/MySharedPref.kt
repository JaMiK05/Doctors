package uz.gita.imtihon3oy.data.share

import android.content.SharedPreferences
import javax.inject.Inject

class MySharedPref @Inject constructor(private val pref: SharedPreferences) {

    fun viewPagerGet(): Boolean {
        return pref.getBoolean("viewPager", false)
    }

    fun viewPagerSet(value: Boolean) {
        pref.edit().putBoolean("viewPager", value).apply()
    }

    fun logInGet(): Boolean {
        return pref.getBoolean("logIN", false)
    }

    fun logInSet(value: Boolean) {
        pref.edit().putBoolean("logIN", value).apply()
    }

    fun phoneGet(): String {
        return pref.getString("PHONE", "")!!
    }

    fun phoneSet(value: String) {
        pref.edit().putString("PHONE", value).apply()
    }

    fun passwordGet(): String {
        return pref.getString("PASSWORD", "")!!
    }

    fun passwordSet(value: String) {
        pref.edit().putString("PASSWORD", value).apply()
    }

}