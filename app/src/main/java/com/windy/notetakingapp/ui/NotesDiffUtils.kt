package com.windy.notetakingapp.ui

import androidx.recyclerview.widget.DiffUtil

class NotesDiffUtils <T>(val movieOldList: List<T>, val movieNewList: List<T>) :
    DiffUtil.Callback() {
    override fun getOldListSize() = movieOldList.size

    override fun getNewListSize() = movieNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        movieOldList[oldItemPosition] == movieNewList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) = true
}