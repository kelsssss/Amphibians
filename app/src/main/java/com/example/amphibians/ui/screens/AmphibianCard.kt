package com.example.amphibians.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.amphibians.R

import com.example.compose.AmphibiansTheme

@Composable
fun AmphibianCard(
    name: String,
    description: String,
    type: String,
    imgSrc: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "${name}(${type})",
                modifier = modifier
                    .padding(top = 10.dp),
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center
            )
            Box {
                AsyncImage(
                    model = imgSrc,
                    contentDescription = null
                )
            }
            Text(
                text = description,
                modifier = Modifier
                    .padding(vertical = 10.dp, horizontal = 10.dp)
                    )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun AmphibianCardPreview(){
    AmphibiansTheme {
        AmphibianCard(
            name = "Тестовое название",
            description = "Тестовое описание млщштымщ авытм авдмы фмвамм авы маыфвм авчым авым вы  в",
            type = "Тип",
            imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/great-basin-spadefoot.png"
        )
    }
}