package uz.gita.imtihon3oy.presentation.screen.fragment.viewpager

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.databinding.ScreenFirstPageBinding

class FirstPage : Fragment(R.layout.screen_first_page) {
    private val binding by viewBinding(ScreenFirstPageBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.root.setOnClickListener {
            findNavController().navigate(FirstPageDirections.actionFirstPageToViewPagerScreen())
        }
        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finishAffinity()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
    }
}