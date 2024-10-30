package com.example.amphibians.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.amphibians.network.Repository
import com.example.amphibians.ui.AmphibianUiState
import com.example.amphibians.ui.AmphibianViewModel
import com.example.amphibians.ui.theme.AmphibiansTheme


@Composable
fun AmphibiansApp(
    amphibiansViewModel: AmphibianViewModel = AmphibianViewModel()
) {
    var amphibianUiState = amphibiansViewModel.amphibiansUiState


    AmphibiansTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            topBar = { AmphibiansTopBar() }
        ) { innerPadding ->
            when(amphibianUiState){
                is AmphibianUiState.Loading -> LoadingScreen()
                is AmphibianUiState.Success -> AmphibiansList(
                    amphibians = amphibianUiState.amphibians,
                    modifier = Modifier.padding(innerPadding)
                )
                else -> ErrorScreen()
            }

        }
    }
}




//@Preview(showBackground = true)
//@Composable
//fun AmphibiansAppPreview(){
//    AmphibiansApp()
//}