package com.example.amphibians.ui.screens


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.amphibians.ui.theme.AmphibiansTheme

@Composable
 fun AmphibiansList(
     modifier : Modifier = Modifier
 ){
     LazyColumn(
         modifier = modifier
             .fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally,
     ) {
         items(4) {
             AmphibianCard(
                 modifier = modifier
                     .fillParentMaxWidth(0.9f)
                     .padding(top = 15.dp)
             )
         }
     }
 }


@Preview
@Composable
fun AmphibiansListPreview(){
    AmphibiansTheme {
        AmphibiansList()
    }
}