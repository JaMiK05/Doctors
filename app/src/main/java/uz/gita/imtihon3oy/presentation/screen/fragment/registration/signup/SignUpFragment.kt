package uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.data.model.request.RegisterRequest
import uz.gita.imtihon3oy.databinding.FragmentSignupBinding
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.viewmodel.impl.SignViewModeImplUp

@AndroidEntryPoint
class SignUpFragment : Fragment(R.layout.fragment_signup) {

    private val binding by viewBinding(FragmentSignupBinding::bind)

    private val viewModel by viewModels<SignViewModeImplUp>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.resultLiveData.observe(this) {
            binding.apply {
                imageView2.visibility = View.GONE
                phoneAndPassword.visibility = View.VISIBLE
            }
            val code = binding.password.text.toString().trim()
            val phone = binding.phone.text.toString().trim()
            findNavController().navigate(
                SignUpFragmentDirections.actionSignInFragmentToVerifyFragment2(code, phone)
            )
        }

        viewModel.failLiveData.observe(this) {
            binding.apply {
                imageView2.visibility = View.GONE
                phoneAndPassword.visibility = View.VISIBLE
            }
            Snackbar.make(
                binding.root, "Fail", Snackbar.LENGTH_SHORT
            ).setBackgroundTint(
                ContextCompat.getColor(
                    requireContext(), R.color.teal_200
                )
            ).show()
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            val animLoad = imageView2.drawable as AnimationDrawable
            animLoad.start()

            phone.doAfterTextChanged {
                check()
            }

            password.doAfterTextChanged {
                check()
            }

            signin.setOnClickListener {
                findNavController().navigate(SignUpFragmentDirections.actionSignInFragmentToLoginFragment())
            }

            signup.setOnClickListener {
                imageView2.visibility = View.VISIBLE
                phoneAndPassword.visibility = View.INVISIBLE
                val request = RegisterRequest(
                    phone = phone.text.toString().trim(),
                    password = password.text.toString().trim()
                )
                viewModel.signUp(request)
            }

        }
        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {

            override fun handleOnBackPressed() {
                findNavController().navigate(SignUpFragmentDirections.actionSignInFragmentToRegistrFragment())
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
    }

    private fun check() {

        binding.apply {
            signup.isEnabled = false
            val phoneNumber = phone.text.toString().trim()
            val pasword = password.text.toString().trim()

            if (pasword.length < 6 || pasword.length > 15) return


            if (phoneNumber.length != 13) return

            val str = phoneNumber.substring(0, 4)

            if (str != "+998") return

            signup.isEnabled = true

        }

    }


}