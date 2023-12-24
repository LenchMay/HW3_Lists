package com.example.hw3lists

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw3lists.databinding.FoxItemBinding

class FoxAdapter(): RecyclerView.Adapter<FoxAdapter.FoxesViewHolder>() {

    var foxes: List<Fox> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoxesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FoxItemBinding.inflate(inflater, parent, false)
        return  FoxesViewHolder(binding)
    }

    override fun getItemCount(): Int = foxes.size

    override fun onBindViewHolder(holder: FoxesViewHolder, position: Int) {
        val fox = foxes[position]
        with(holder.binding) {
            foxName.text = fox.name
            foxAge.text = fox.age
            foxColor.text = fox.color
        }
    }

    class FoxesViewHolder(val binding: FoxItemBinding): RecyclerView.ViewHolder(binding.root)
}