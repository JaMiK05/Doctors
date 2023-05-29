package uz.gita.imtihon3oy.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity
import uz.gita.imtihon3oy.databinding.ItemDoctorBinding

class DoctorAdapter : ListAdapter<DoctorEntity, DoctorAdapter.ViewHolder>(MyDiffUtil) {
    private var clickListener: ((id: Long) -> Unit)? = null

    object MyDiffUtil : DiffUtil.ItemCallback<DoctorEntity>() {
        override fun areItemsTheSame(oldItem: DoctorEntity, newItem: DoctorEntity): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: DoctorEntity, newItem: DoctorEntity): Boolean {
            return oldItem == newItem
        }
    }

    inner class ViewHolder(private val binding: ItemDoctorBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(doctor: DoctorEntity) = with(binding) {
            if (doctor.isFavourite == 1) {
                btnFavoutiteDoctor.setImageResource(R.drawable.favorite_filled)
            } else {
                btnFavoutiteDoctor.setImageResource(R.drawable.favorite)
            }
            Glide
                .with(root.context)
                .load(doctor.picture)
                .centerCrop()
                .into(imgDoctor)

            txtNameDoctor.text = doctor.name
            txtDegreeDoctor.text = doctor.degree
            txtRateDoctor.text = doctor.rate

            btnFavoutiteDoctor.setOnClickListener {
                clickListener?.invoke(doctor.id)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        ItemDoctorBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position).let {
            holder.bind(it)
        }
    }

    fun setFavouriteListener(block: (id: Long) -> Unit) {
        clickListener = block
    }
}