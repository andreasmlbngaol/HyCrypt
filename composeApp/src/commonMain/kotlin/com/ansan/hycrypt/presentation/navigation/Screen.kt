package com.ansan.hycrypt.presentation.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {

    @Serializable
    object Home: NavKey

    @Serializable
    data class Details(val id: Int): NavKey
}