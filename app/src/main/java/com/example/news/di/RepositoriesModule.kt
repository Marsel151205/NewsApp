package com.example.news.di

import com.example.data.repositories.TopHeadlinesRepositoryImpl
import com.example.domain.repositories.TopHeadlinesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindTopHeadlinesRepository(topHeadlinesRepositoryImpl: TopHeadlinesRepositoryImpl): TopHeadlinesRepository
}