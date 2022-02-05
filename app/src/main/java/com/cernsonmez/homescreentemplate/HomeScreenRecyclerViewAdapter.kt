package com.cernsonmez.homescreentemplate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cernsonmez.homescreentemplate.databinding.HorizontalSwipeItemBinding
import com.cernsonmez.homescreentemplate.databinding.VerticalSwipeItemBinding

class HomeScreenRecyclerViewAdapter : RecyclerView.Adapter<HomeScreenRecyclerViewHolder>() {

    var items = listOf<RecyclerViewItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeScreenRecyclerViewHolder {
        return when(viewType){
            1 -> HomeScreenRecyclerViewHolder.HorizontalViewHolder(
                HorizontalSwipeItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            2 -> HomeScreenRecyclerViewHolder.VerticalViewHolder(
                VerticalSwipeItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalArgumentException("Invalid ViewType Provided")
        }
    }

    override fun onBindViewHolder(holder: HomeScreenRecyclerViewHolder, position: Int) {
        when(holder){
            is HomeScreenRecyclerViewHolder.HorizontalViewHolder -> holder.bind(items[position] as RecyclerViewItem.HorizontalListData)
            is HomeScreenRecyclerViewHolder.VerticalViewHolder -> holder.bind(items[position] as RecyclerViewItem.VerticalListData)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is RecyclerViewItem.HorizontalListData -> 1
            is RecyclerViewItem.VerticalListData -> 2
            else -> return 0
        }
    }
}