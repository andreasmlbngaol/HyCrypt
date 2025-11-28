package com.ansan.hycrypt

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.ansan.hycrypt.presentation.navigation.Navigator
import com.ansan.hycrypt.presentation.navigation.popAnimation
import com.ansan.hycrypt.presentation.navigation.pushAnimation
import com.ansan.hycrypt.presentation.theme.HyCryptTheme
import org.koin.compose.koinInject
import org.koin.compose.navigation3.koinEntryProvider
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun App() {
    HyCryptTheme {
        val entryProvider = koinEntryProvider()
        val navigator = koinInject<Navigator>()

        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxSize()
        ) {
            NavDisplay(
                backStack = navigator.backstack,
                onBack = { navigator.goBack() },
                entryProvider = entryProvider,
                entryDecorators = listOf(
                    rememberSaveableStateHolderNavEntryDecorator(),
                    rememberViewModelStoreNavEntryDecorator()
                ),
                transitionSpec = { pushAnimation },
                popTransitionSpec = { popAnimation }
            )
        }
    }
}