package com.arana.aranacarteirinha.feature.carteirinha.presetantion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.arana.aranacarteirinha.R
import com.arana.aranacarteirinha.feature.carteirinha.presetantion.component.PerfilAluno
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.img_2),
            contentDescription = "Fundo",
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.5f),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = modifier.fillMaxSize()

        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo Senai",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )
            PerfilAluno(
                nome = "Arana",
                curso = "Desenvolvimento de Sistemas"
            )
            QrCode(
                conteudo = "Jesus salva"
            )
        }

    }

}