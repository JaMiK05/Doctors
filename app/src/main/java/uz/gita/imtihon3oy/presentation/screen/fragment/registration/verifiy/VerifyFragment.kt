package uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.data.model.request.VerifyRequest
import uz.gita.imtihon3oy.data.model.response.UserData
import uz.gita.imtihon3oy.data.share.MySharedPref
import uz.gita.imtihon3oy.databinding.FragmentVerifyBinding
import uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy.viewmodel.impl.VerifyViewModelimpl
import javax.inject.Inject

@AndroidEntryPoint
class VerifyFragment : Fragment(R.layout.fragment_verify) {

    private val viewModel by viewModels<VerifyViewModelimpl>()

    private val args by navArgs<VerifyFragmentArgs>()

    private val binding by viewBinding(FragmentVerifyBinding::bind)

    @Inject
    lateinit var shared: MySharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.succesLiveData.observe(this) {
            val user =
                UserData(
                    phone = binding.number.text.toString().trim(),
                    password = args.code
                )
            viewModel.addUser(user)
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
        viewModel.addLiveData.observe(this) {
            binding.apply {
                imageView2.visibility = View.GONE
                phoneAndPassword.visibility = View.VISIBLE
            }
            shared.logInSet(true)
            findNavController().navigate(
                VerifyFragmentDirections.actionVerifyFragmentToProfileScreen(
                    binding.number.text.toString().trim(),
                    args.code
                )
            )
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            val animLoad = imageView2.drawable as AnimationDrawable
            animLoad.start()

            number.doAfterTextChanged {
                check()
            }
            number.setText(args.phone)

            password.doAfterTextChanged {
                check()
            }

            sendBtn.setOnClickListener {
                imageView2.visibility = View.VISIBLE
                phoneAndPassword.visibility = View.INVISIBLE
                val request = VerifyRequest(
                    phone = number.text.toString().trim(),
                    code = password.text.toString().trim()
                )
                viewModel.verify(request)
            }

        }

    }

    private fun check() {
        binding.apply {
            sendBtn.isEnabled = false
            val phoneNumber = number.text.toString().trim()
            val pasword = password.text.toString().trim()
            if (pasword.length < 6 || pasword.length > 15) return
            if (phoneNumber.length != 13) return
            val str = phoneNumber.substring(0, 4)
            if (str != "+998") return
            sendBtn.isEnabled = true
        }
    }

}