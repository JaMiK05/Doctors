package uz.gita.imtihon3oy.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import uz.gita.imtihon3oy.R
import uz.gita.imtihon3oy.databinding.ItemPageBinding

class ViewPagerAdapter : Adapter<ViewPagerAdapter.MyViewHolder>() {


    inner class MyViewHolder(val binding: ItemPageBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            when (position) {
                0 -> {
                    binding.image.setImageResource(R.drawable.boardingpic1)
                }

                1 -> {
                    binding.image.setImageResource(R.drawable.boardingpic2)
                }

                2 -> {
                    binding.image.setImageResource(R.drawable.boardingpic3)
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemPageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.animatsiya)
        holder.bind(position)
    }

}