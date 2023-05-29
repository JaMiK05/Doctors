package uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.databinding.FragmentRegistrBinding

@AndroidEntryPoint
class RegistrFragment : Fragment(R.layout.fragment_registr) {

    private val binding by viewBinding(FragmentRegistrBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            logn.setOnClickListener {
                findNavController().navigate(RegistrFragmentDirections.actionRegistrFragmentToLoginFragment())
            }
            sign.setOnClickListener {

                findNavController().navigate(RegistrFragmentDirections.actionRegistrFragmentToSignInFragment())
            }
        }

        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finishAffinity()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)

    }


}