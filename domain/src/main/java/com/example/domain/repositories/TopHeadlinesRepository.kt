package com.example.domain.repositories

import com.example.common.either.Either
import com.example.domain.models.topheadlines.ArticlesModel
import kotlinx.coroutines.flow.Flow

interface TopHeadlinesRepository {

    fun fetchTopHeadlines(): Flow<Either<String, List<ArticlesModel>>>
}