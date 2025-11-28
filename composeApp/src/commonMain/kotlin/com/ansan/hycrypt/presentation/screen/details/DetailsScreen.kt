package com.ansan.hycrypt.presentation.screen.details

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ansan.hycrypt.presentation.component.Center
import com.ansan.hycrypt.presentation.component.TopBar
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun DetailsScreen(
    id: Int,
) {
    val viewModel = koinViewModel<DetailsViewModel> { parametersOf(id) }

    Scaffold(
        topBar = {
            TopBar("HyCrypt Details Screen")
        }
    ) {
        Center(
            modifier = Modifier.fillMaxSize(),
        ) {
            Text(
                text = "Generated ID: $id",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}