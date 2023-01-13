package com.example.presentation.ui.fragments.topheadlines

import android.util.Log
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.common.either.Either
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentTopHeadlinesBinding
import com.example.presentation.models.topheadlines.toUI
import com.example.presentation.ui.adapters.TopHeadlinesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TopHeadlinesFragment :
    BaseFragment<FragmentTopHeadlinesBinding, TopHeadlinesViewModel>(R.layout.fragment_top_headlines) {

    override val binding by viewBinding(FragmentTopHeadlinesBinding::bind)
    override val viewModel: TopHeadlinesViewModel by viewModels()
    private val topHeadlinesAdapter = TopHeadlinesAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    override fun setupSubscribe() {
        subscribeToTopHeadlines()
    }

    private fun setupRecyclerView() {
        binding.rvTopHeadlines.adapter = topHeadlinesAdapter
    }

    private fun subscribeToTopHeadlines() {
        lifecycleScope.launch {
            viewModel.getTopHeadlines().collect {
                when (it) {
                    is Either.Left -> {
                        Log.e("news", it.message.toString())
                    }
                    is Either.Right -> {
                        val mappingList = it.data?.map { model ->
                            model.toUI()
                        }
                        Toast.makeText(requireContext(), mappingList.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}