package com.example.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.presentation.base.BaseDiffUtilItemCallback
import com.example.presentation.databinding.ItemTopHeadlinesBinding
import com.example.presentation.models.topheadlines.ArticlesModelUI

class TopHeadlinesAdapter :
    ListAdapter<ArticlesModelUI, TopHeadlinesAdapter.TopHeadlinesViewHolder>(
        BaseDiffUtilItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopHeadlinesViewHolder =
        TopHeadlinesViewHolder(
            ItemTopHeadlinesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: TopHeadlinesViewHolder, position: Int) {
        getItem(position).let { holder.onBind(it) }
    }

    class TopHeadlinesViewHolder(private val binding: ItemTopHeadlinesBinding) :
        ViewHolder(binding.root) {
        fun onBind(modelUI: ArticlesModelUI) {
            with(binding) {
                tvTitle.text = modelUI.title.toString()
                ivImageNews.load(modelUI.urlToImage)
            }
        }
    }
}