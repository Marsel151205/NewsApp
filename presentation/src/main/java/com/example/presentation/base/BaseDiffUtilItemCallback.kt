package com.example.presentation.base

import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtilItemCallback<T : IBaseDiffModel<S>, S> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = oldItem.title == newItem.title
    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem
}