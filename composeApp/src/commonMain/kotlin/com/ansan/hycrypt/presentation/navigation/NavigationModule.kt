package com.ansan.hycrypt.presentation.navigation

import com.ansan.hycrypt.presentation.screen.details.DetailsScreen
import com.ansan.hycrypt.presentation.screen.home.HomeScreen
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

@OptIn(KoinExperimentalAPI::class)
val navigationModule = module {
    single { Navigator(Screen.Home) }

    navigation<Screen.Home> {
        HomeScreen(
            navigateToDetails = { number ->
                get<Navigator>().navigateTo(Screen.Details(number))
            }
        )
    }

    navigation<Screen.Details> { route ->
        DetailsScreen(
            id = route.id,
//            navigateBack = { get<Navigator>().goBack() }
        )
    }
}