package com.example.data.repositories

import com.example.common.either.Either
import com.example.data.base.BaseRepository
import com.example.data.remote.apiservices.TopHeadlinesApiService
import com.example.data.remote.dtos.topheadlines.toDomain
import com.example.domain.models.topheadlines.ArticlesModel
import com.example.domain.repositories.TopHeadlinesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TopHeadlinesRepositoryImpl @Inject constructor(
    private val service: TopHeadlinesApiService
): BaseRepository(), TopHeadlinesRepository {

    override fun fetchTopHeadlines(): Flow<Either<String, List<ArticlesModel>>> = doRequest {
        service.fetchTopHeadlines().articles.map {
            it.toDomain()
        }
    }
}