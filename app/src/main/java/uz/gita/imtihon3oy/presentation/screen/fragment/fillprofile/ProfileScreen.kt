package uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.net.toUri
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.data.model.ProfileData
import uz.gita.imtihon3oy.databinding.ScreenProfileBinding
import uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile.viewmodel.ProfileViewModelImpl

@AndroidEntryPoint
class ProfileScreen : Fragment(R.layout.screen_profile) {
    private lateinit var launcher: ActivityResultLauncher<Intent>
    private val binding by viewBinding(ScreenProfileBinding::bind)
    private val viewModel by viewModels<ProfileViewModelImpl>()
    private var imageUri: Uri =
        "https://firebasestorage.googleapis.com/v0/b/imtihon-3-oy.appspot.com/o/avatar.png?alt=media&token=e9ec9df7-4f5e-4e75-9217-099b44d673bb".toUri()

    private val args by navArgs<ProfileScreenArgs>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.openNextScreenLiveData.observe(this, openNextScreenLiveData)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {
            btnEdit.setOnClickListener {
                openGallery()
            }
            editFullName.doAfterTextChanged {
                check()
            }
            editDate.doAfterTextChanged {
                check()
            }
            editEmail.doAfterTextChanged {
                check()
            }
            editGenter.doAfterTextChanged {
                check()
            }

            btnContinue.setOnClickListener {
                viewModel.addProfile(
                    ProfileData(
                        name = editFullName.text.toString(),
                        nickname = editNickName.text.toString(),
                        dateOfBirth = editDate.text.toString(),
                        email = editEmail.text.toString(),
                        password = args.password,
                        phone = args.phone,
                        gender = editGenter.text.toString(),
                        imgUri = imageUri
                    )
                )
            }
        }
        launcher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { callback ->
                callback.data?.data?.let {
                    binding.avatar.setImageURI(it)
                    imageUri = it
                }
            }

        viewModel.errorLiveData.observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }

        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finishAffinity()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)

    }

    private fun check() {
        binding.apply {
            if (editFullName.text.toString().isEmpty() || editNickName.text.toString()
                    .isEmpty() || editDate.text.toString().isEmpty() || editEmail.text.toString()
                    .isEmpty() || editGenter.text.toString().isEmpty()
            ) {
                btnContinue.isClickable = false
                btnContinue.isEnabled = false
            } else {
                btnContinue.isClickable = true
                btnContinue.isEnabled = true
            }
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }


    private fun openGallery() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        launcher.launch(intent)
    }

    private val openNextScreenLiveData = Observer<Unit> {
        findNavController().navigate(ProfileScreenDirections.actionProfileScreenToMainFragment())
    }
}