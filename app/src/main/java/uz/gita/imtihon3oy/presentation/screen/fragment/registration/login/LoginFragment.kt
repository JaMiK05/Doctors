package uz.gita.imtihon3oy.presentation.screen.fragment.registration.login

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
import uz.gita.imtihon3oy.data.model.request.LoginRequest
import uz.gita.imtihon3oy.data.share.MySharedPref
import uz.gita.imtihon3oy.databinding.FragmentLoginBinding
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.login.viewmodel.impl.LoginViewModelimpl
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup.SignUpFragmentDirections
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {

    private val viewModel by viewModels<LoginViewModelimpl>()

    private val binding by viewBinding(FragmentLoginBinding::bind)

    @Inject
    lateinit var shared1: MySharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.resultLiveData.observe(this) {
            shared1.logInSet(true)
            binding.apply {
                imageView2.visibility = View.GONE
                phoneAndPassword.visibility = View.VISIBLE
            }
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToMainFragment())
        }

        viewModel.failLiveData.observe(this) {
            binding.apply {
                imageView2.visibility = View.GONE
                phoneAndPassword.visibility = View.VISIBLE
            }
            Snackbar.make(
                binding.root,
                "user mavjud emas yoki parol xato bolishi mumkin",
                Snackbar.LENGTH_SHORT
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
                binding.apply {
                    imageView2.visibility = View.VISIBLE
                    phoneAndPassword.visibility = View.INVISIBLE
                }
                val request = LoginRequest(
                    phone = phone.text.toString().trim(), password = password.text.toString().trim()
                )
                viewModel.logIn(request)
            }
            signup.setOnClickListener {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignInFragment())
            }

            val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegistrFragment())
                }
            }
            requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
        }
    }

    private fun check() {

        binding.apply {
            signin.isEnabled = false
            val phoneNumber = phone.text.toString().trim()
            val pasword = password.text.toString().trim()

            if (pasword.length < 6 || pasword.length > 15) return

            if (phoneNumber.isEmpty()) return

            signin.isEnabled = true

        }

    }

}