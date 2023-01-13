package com.example.data.remote.dtos.topheadlines

import com.google.gson.annotations.SerializedName

data class TopHeadlinesResponse<T>(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResult")
    val totalResult: Int,
    @SerializedName("articles")
    val articles: List<T>
)