package com.example.amphibians.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.amphibians.R
import com.example.amphibians.ui.theme.AmphibiansTheme

@Composable
fun AmphibianCard(
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
                text = "Заголовок карточки"
            )
            Box {
                Image(
                    painter = painterResource(R.drawable.imagetest),
                    contentDescription = "Картинка",
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = "Ультранасилие - это понятие, которое вызывает контроверзы и споры. Термин ультранасилие относится к экстремальным формам насилия, превышающим обычные пределы и допустимые нормы. Такие формы насилия характеризуются чрезмерной жестокостью и жестокостью в поступках."
                    )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun AmphibianCardPreview(){
    AmphibiansTheme {
        AmphibianCard()
    }
}