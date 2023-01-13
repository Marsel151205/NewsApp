package com.example.presentation.ui.fragments.topheadlines

import androidx.lifecycle.ViewModel
import com.example.domain.usecases.GetTopHeadlinesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TopHeadlinesViewModel @Inject constructor(
    private val getTopHeadlinesUseCase: GetTopHeadlinesUseCase
) : ViewModel() {

    fun getTopHeadlines() = getTopHeadlinesUseCase()
}