package com.example.presentation.models.topheadlines

import com.example.domain.models.topheadlines.ArticlesModel
import com.example.presentation.base.IBaseDiffModel

data class ArticlesModelUI(
    val source: SourceModelUI,
    val author: String? = null,
    override val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
) : IBaseDiffModel<String>

fun ArticlesModel.toUI() = ArticlesModelUI(
    source = source.toUI(),
    author = author,
    title = title,
    description = description,
    url = url,
    urlToImage = urlToImage,
    publishedAt = publishedAt,
    content = content
)