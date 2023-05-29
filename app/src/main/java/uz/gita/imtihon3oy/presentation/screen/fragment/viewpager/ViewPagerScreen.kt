package uz.gita.imtihon3oy.presentation.screen.fragment.viewpager

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.data.share.MySharedPref
import uz.gita.imtihon3oy.databinding.ScreenPagerBinding
import uz.gita.imtihon3oy.presentation.adapter.ViewPagerAdapter
import javax.inject.Inject

@AndroidEntryPoint
class ViewPagerScreen : Fragment(R.layout.screen_pager) {

    private val binding by viewBinding(ScreenPagerBinding::bind)

    private val vp: ViewPager2 by lazy { binding.viewPager }
    private val buttonNext by lazy { binding.btnNext }
    private val title by lazy { binding.title }
    private val dots: DotsIndicator by lazy { binding.dots }

    @Inject
    lateinit var shared: MySharedPref

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = ViewPagerAdapter()

        vp.adapter = adapter
        dots.attachTo(vp)

        vp.registerOnPageChangeCallback(ob)

        binding.btnNext.setOnClickListener {
            if (vp.currentItem < 2)
                vp.currentItem = vp.currentItem + 1
            else {
                shared.viewPagerSet(true)
                findNavController().navigate(ViewPagerScreenDirections.actionViewPagerScreenToRegistrFragment())
            }
        }
    }

    private val ob = object : ViewPager2.OnPageChangeCallback() {
        @SuppressLint("SetTextI18n")
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)

            if (position < 2) {
                if (position == 1) {
                    title.text = "Health checks & consultations easily anywhere anytime"
                } else {
                    title.text = "Thousands of doctors &amp; experts to help your health!"
                }
                buttonNext.text = "Next"
            } else {
                title.text = "Let's start living healthy and well with us right now!"
                buttonNext.text = "Get started"
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        vp.unregisterOnPageChangeCallback(ob)
    }
}