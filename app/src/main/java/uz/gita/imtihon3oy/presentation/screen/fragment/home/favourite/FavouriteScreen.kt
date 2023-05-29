package uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.imtihon3oy.presentation.screen.fragment.home.favourite.viewmodel.FavouriteViewModelImpl
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.databinding.ScreenFavouriteBinding
import uz.gita.imtihon3oy.presentation.adapter.DoctorAdapter

@AndroidEntryPoint
class FavouriteScreen : Fragment(R.layout.screen_favourite) {
    private val binding by viewBinding(ScreenFavouriteBinding::bind)
    private val viewModel by viewModels<FavouriteViewModelImpl>()
    private val adapter: DoctorAdapter = DoctorAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.loadingLiveData.observe(viewLifecycleOwner) {
            if (it) {
                binding.progress.visibility = View.VISIBLE
            } else {
                binding.progress.visibility = View.GONE
            }
        }

        viewModel.doctorsLiveData.observe(viewLifecycleOwner) {
            if (it.isNullOrEmpty()) {
                binding.emptyList.visibility = View.VISIBLE
            } else {
                binding.emptyList.visibility = View.GONE
            }
            adapter.submitList(it)
        }
        viewModel.getFavouriteDocs()
        binding.apply {
            adapter.setFavouriteListener {
                viewModel.changeFavoutite(it)
            }
            recyclerview123.adapter = adapter
            recyclerview123.layoutManager = GridLayoutManager(requireContext(), 1)
        }
        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.nameScreen.text = "My Favourite Doctor"
    }
}