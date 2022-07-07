package com.example.mynetflix.ui.home.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mynetflix.databinding.ItemHomeGenreListBinding
import com.example.mynetflix.models.home.ResponseGenreList.ResponseGenreListItem
import javax.inject.Inject

class GenresAdapter @Inject constructor() : RecyclerView.Adapter<GenresAdapter.ViewHolder>() {

    private lateinit var binding: ItemHomeGenreListBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenresAdapter.ViewHolder {
        binding =
            ItemHomeGenreListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: GenresAdapter.ViewHolder, position: Int) {
        holder.setData(differ.currentList[position])
        holder.setIsRecyclable(false)
    }

    override fun getItemCount() = differ.currentList.size

    inner class ViewHolder : RecyclerView.ViewHolder(binding.root) {
        fun setData(item: ResponseGenreListItem) {
            binding.apply {
                nameTxt.text = item.name
            }
        }
    }

    private val differCallback = object : DiffUtil.ItemCallback<ResponseGenreListItem>() {
        override fun areItemsTheSame(
            oldItem: ResponseGenreListItem,
            newItem: ResponseGenreListItem
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ResponseGenreListItem,
            newItem: ResponseGenreListItem
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)
}
