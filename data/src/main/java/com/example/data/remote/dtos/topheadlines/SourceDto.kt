package com.example.data.remote.dtos.topheadlines

import com.example.domain.models.topheadlines.SourceModel
import com.google.gson.annotations.SerializedName

data class SourceDto(
    @SerializedName("id")
    val id: String?= null,
    @SerializedName("name")
    val name: String
)

fun SourceDto.toDomain() = SourceModel(
    id = id,
    name = name
)
