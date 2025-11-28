package com.ansan.hycrypt.presentation.screen.details

import androidx.lifecycle.ViewModel
import kotlin.time.ExperimentalTime

class DetailsViewModel(
    val id: Int
): ViewModel() {
    init {
        println("DetailsViewModel initialized...")
    }

    @OptIn(ExperimentalTime::class)
    override fun onCleared() {
        super.onCleared()
        println("DetailsViewModel destroyed...")
    }
}