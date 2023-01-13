package com.example.data.remote.dtos.topheadlines

import com.example.domain.models.topheadlines.ArticlesModel
import com.google.gson.annotations.SerializedName

data class ArticlesDto(
    @SerializedName("source")
    val source: SourceDto,
    @SerializedName("author")
    val author: String?= null,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("urlToImage")
    val urlToImage: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("content")
    val content: String
)

fun ArticlesDto.toDomain() = ArticlesModel(
    source = source.toDomain(),
    author = author,
    title = title,
    description = description,
    url = url,
    urlToImage = urlToImage,
    publishedAt = publishedAt,
    content = content
)
