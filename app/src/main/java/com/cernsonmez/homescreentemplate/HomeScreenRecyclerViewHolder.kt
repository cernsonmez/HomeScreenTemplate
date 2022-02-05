package com.cernsonmez.homescreentemplate

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.cernsonmez.homescreentemplate.databinding.HorizontalSwipeItemBinding
import com.cernsonmez.homescreentemplate.databinding.VerticalSwipeItemBinding

sealed class HomeScreenRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class HorizontalViewHolder(private val binding: HorizontalSwipeItemBinding) : HomeScreenRecyclerViewHolder(binding){
        fun bind(horizontalListData: RecyclerViewItem.HorizontalListData){
            binding.horizontalViewItem = horizontalListData
            binding.executePendingBindings()
        }
    }

    class VerticalViewHolder(private val binding: VerticalSwipeItemBinding) : HomeScreenRecyclerViewHolder(binding){
        fun bind(verticalListData: RecyclerViewItem.VerticalListData){
            binding.verticalListItem= verticalListData
            binding.executePendingBindings()
        }
    }
}