package com.cernsonmez.homescreentemplate

sealed class RecyclerViewItem {

    class HorizontalListData(
        val id: String,
        val imageUrl: String
    ) :  RecyclerViewItem()

    class VerticalListData(
        val id: String,
        val imageUrl: String
    ) :  RecyclerViewItem()
}