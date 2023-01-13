package com.example.presentation.models.topheadlines

import com.example.domain.models.topheadlines.SourceModel


data class SourceModelUI(
    val id: String?= null,
    val name: String
)

fun SourceModel.toUI() = SourceModelUI(
    id = id,
    name = name
)