package com.ansan.hycrypt.presentation.screen.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ansan.hycrypt.presentation.component.Center
import com.ansan.hycrypt.presentation.component.TopBar
import org.koin.compose.viewmodel.koinViewModel
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToDetails: (Int) -> Unit
) {
    val viewModel = koinViewModel<HomeViewModel>()

    Scaffold(
        topBar = {
            TopBar("HyCrypt Home Screen")
        }
    ) {
        Center(
            modifier = Modifier.fillMaxSize(),
        ) {
            Button(
                onClick = {
                    navigateToDetails(Random.nextInt(from = 1, until = 100))
                }
            ) {
                Text(
                    "Go to details"
                )
            }
        }
    }
}