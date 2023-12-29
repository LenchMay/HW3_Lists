package com.example.hw3lists

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw3lists.databinding.FoxItemBinding

class FoxAdapter(): RecyclerView.Adapter<FoxAdapter.FoxesViewHolder>() {

    private var foxes = mutableListOf<Fox>()

    fun addFox(fox: Fox){
        foxes.add(fox)
        notifyItemInserted(foxes.size - 1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoxesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return FoxesViewHolder(FoxItemBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int = foxes.size

    override fun onBindViewHolder(holder: FoxesViewHolder, position: Int) = holder.bind(foxes[position])

    class FoxesViewHolder(
        private val binding: FoxItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(fox: Fox) {
            binding.foxName.text = fox.name
            binding.foxAge.text = fox.age
            binding.foxColor.text = fox.color
        }
    }
}