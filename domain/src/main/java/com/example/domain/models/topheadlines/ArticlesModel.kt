package com.example.domain.models.topheadlines

data class ArticlesModel(
    val source: SourceModel,
    val author: String? = null,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)