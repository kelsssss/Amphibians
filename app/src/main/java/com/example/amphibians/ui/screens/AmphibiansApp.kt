package com.example.amphibians.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.amphibians.ui.AmphibianUiState
import com.example.amphibians.ui.AmphibianViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

import com.example.compose.AmphibiansTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmphibiansApp() {
//    var amphibianUiState = amphibiansViewModel.amphibiansUiState


    AmphibiansTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            topBar = { AmphibiansTopBar() }
        ) { innerPadding ->

            Surface {
                val amphibianViewModel: AmphibianViewModel = viewModel(factory = AmphibianViewModel.Factory)
                var amphibianUiState = amphibianViewModel.amphibiansUiState

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
}




//@Preview(showBackground = true)
//@Composable
//fun AmphibiansAppPreview(){
//    AmphibiansApp()
//}