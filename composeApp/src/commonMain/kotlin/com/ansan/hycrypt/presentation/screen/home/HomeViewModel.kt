package com.ansan.hycrypt.presentation.screen.home

import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {
    init {
        println("HomeViewModel initialized...")
    }

    override fun onCleared() {
        super.onCleared()
        println("HomeViewModel destroyed...")
    }
}