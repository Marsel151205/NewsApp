package com.example.presentation.base

interface IBaseDiffModel<T> {
    val title: T
    override fun equals(other: Any?): Boolean
}