package com.example.data.remote.apiservices

import com.example.data.remote.dtos.topheadlines.ArticlesDto
import com.example.data.remote.dtos.topheadlines.TopHeadlinesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TopHeadlinesApiService {

    @GET("top-headlines")
    suspend fun fetchTopHeadlines(
        @Query("country") country: String = "ru"
    ): TopHeadlinesResponse<ArticlesDto>
}