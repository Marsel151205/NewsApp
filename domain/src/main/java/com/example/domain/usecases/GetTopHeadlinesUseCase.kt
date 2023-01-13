package com.example.domain.usecases

import com.example.domain.repositories.TopHeadlinesRepository
import javax.inject.Inject

class GetTopHeadlinesUseCase @Inject constructor(
    private val topHeadlinesRepository: TopHeadlinesRepository
) {

    operator fun invoke() = topHeadlinesRepository.fetchTopHeadlines()
}