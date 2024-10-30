package com.example.amphibians.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.amphibians.network.Repository
import com.example.amphibians.ui.theme.AmphibiansTheme


@Composable
fun AmphibiansApp() {
    AmphibiansTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            topBar = { AmphibiansTopBar() }
        ) { innerPadding ->
            SuccessScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
fun SuccessScreen(modifier: Modifier){
    AmphibiansList(
        downloadedData = Repository.getData(),
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun AmphibiansAppPreview(){
    AmphibiansApp()
}