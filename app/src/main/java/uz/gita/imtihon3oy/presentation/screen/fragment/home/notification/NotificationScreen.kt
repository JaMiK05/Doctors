package uz.gita.imtihon3oy.presentation.screen.fragment.home.notification

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.databinding.ScreenFavouriteBinding
import uz.gita.imtihon3oy.presentation.adapter.NotifyAdapter
import uz.gita.imtihon3oy.presentation.screen.fragment.home.notification.viewmodel.NotifyViewModelImpl

@AndroidEntryPoint
class NotificationScreen : Fragment(R.layout.screen_favourite) {
    private val binding by viewBinding(ScreenFavouriteBinding::bind)
    private val viewmodel by viewModels<NotifyViewModelImpl>()
    private val adapter: NotifyAdapter = NotifyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewmodel.getNews()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewmodel.loadingLiveData.observe(viewLifecycleOwner) {
            if (it) {
                binding.progress.visibility = View.VISIBLE
            } else {
                binding.progress.visibility = View.GONE
            }
        }

        viewmodel.errorLiveData.observe(viewLifecycleOwner) {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        }
        viewmodel.notifyLiveData.observe(viewLifecycleOwner) {
            if (it.isNullOrEmpty()) {
                binding.emptyList.visibility = View.VISIBLE
            } else {
                binding.emptyList.visibility = View.GONE
            }
            adapter.submitList(it)
        }
        binding.apply {
            recyclerview123.adapter = adapter
            recyclerview123.layoutManager = GridLayoutManager(requireContext(), 1)
        }
        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.nameScreen.text = "Notification"
    }

}