package uz.gita.imtihon3oy.presentation.screen.fragment.splash

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.data.share.MySharedPref
import uz.gita.imtihon3oy.databinding.ScreenSplashBinding
import javax.inject.Inject

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashScreen : Fragment(R.layout.screen_splash) {

    private val binding by viewBinding(ScreenSplashBinding::bind)

    @Inject
    lateinit var shared: MySharedPref
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val animLoad = binding.imageView2.drawable as AnimationDrawable
        animLoad.start()
        lifecycleScope.launch {
            delay(2000)
            if (shared.viewPagerGet()) {
                Log.d("LLL", "view")
                if (shared.logInGet()) {
                    Log.d("LLL", "login")
                    findNavController().navigate(SplashScreenDirections.actionSplashScreenToMainFragment())
                    return@launch
                }
                findNavController().navigate(SplashScreenDirections.actionSplashScreenToRegistrFragment())
            } else {
                Log.d("LLL", "first")
                findNavController().navigate(SplashScreenDirections.actionSplashScreenToFirstPage())
            }

        }
    }
}