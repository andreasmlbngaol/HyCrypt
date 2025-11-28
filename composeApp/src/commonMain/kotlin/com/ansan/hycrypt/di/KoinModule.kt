package com.ansan.hycrypt.di

import com.ansan.hycrypt.presentation.navigation.navigationModule
import com.ansan.hycrypt.presentation.screen.details.DetailsViewModel
import com.ansan.hycrypt.presentation.screen.home.HomeViewModel
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val mainModules = module {
    viewModel { HomeViewModel() }
    viewModel { params -> DetailsViewModel(id = params.get()) }
}

fun initKoin(
    config: (KoinApplication.() -> Unit)? = null
) {
    startKoin {
        config?.invoke(this)
        modules(
            mainModules,
            navigationModule
        )
    }
}