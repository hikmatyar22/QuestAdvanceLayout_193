package com.example.praktikum3

import androidx.annotation.ColorInt
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ActivitasKedua(modifier: Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D1B2A))
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val profil = painterResource(id = R.drawable.profil)
        Image(
            painter = profil,
            contentDescription = null,
            modifier = Modifier
                .size(size = 180.dp)
                .clip(CircleShape)
                .border(2.dp, Color.White, CircleShape)
                .padding(2.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(height = 5.dp))
        Row(){
            val gmail = painterResource(id = R.mipmap.gmail)
            Image(
                painter = gmail,
                contentDescription = null,
                modifier = Modifier
                    .size (size = 50.dp)
                    .padding(all = 5.dp)
            )
            val link = painterResource(id = R.mipmap.link)
            Image(
                painter = link,
                contentDescription = null,
                modifier = Modifier
                    .size (size = 50.dp)
                    .padding(all = 5.dp)
            )
            val instagram = painterResource(id = R.mipmap.ig)
            Image(
                painter = instagram,
                contentDescription = null,
                modifier = Modifier
                    .size (size = 50.dp)
                    .padding(all = 5.dp)
            )
            val tele = painterResource(id = R.mipmap.tele)
            Image(
                painter = tele,
                contentDescription = null,
                modifier = Modifier
                    .size (size = 50.dp)
                    .padding(all = 5.dp)
            )

        }
        Spacer(modifier = Modifier.height(height = 10.dp))
        Text(
            text = stringResource(id = R.string.nama),
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            color = Color.White,
        )
        Text(
            text = stringResource(id = R.string.email),
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
        )

    }

}