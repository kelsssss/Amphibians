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
import com.example.amphibians.network.Repository.localData
import com.example.amphibians.ui.theme.AmphibiansTheme
import androidx.compose.foundation.lazy.items
import com.example.amphibians.ui.model.Amphibian

//modifier = Modifier
//.fillParentMaxWidth(0.9f)
//.padding(bottom = 15.dp)

@Composable
 fun AmphibiansList(
    downloadedData: List<Amphibian>,
     modifier : Modifier = Modifier
 ){
     LazyColumn(
         modifier = modifier
             .fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally,
     ) {
         items(localData) { cardInfo ->
             AmphibianCard(
                 name = cardInfo.name,
                 description = cardInfo.description,
                 modifier = Modifier
                     .fillParentMaxWidth(0.9f)
                     .padding(bottom = 15.dp)
             )
         }
     }
 }


//@Preview
//@Composable
//fun AmphibiansListPreview(){
//    AmphibiansTheme {
//        AmphibiansList()
//    }
//}