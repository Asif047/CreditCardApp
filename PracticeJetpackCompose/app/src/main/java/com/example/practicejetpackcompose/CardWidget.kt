package com.example.practicejetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CardWidget (){
    Column {
        Row(modifier = Modifier.padding(10.dp)) {
            Image(
                painter = rememberAsyncImagePainter("https://randomuser.me/api/portraits/men/24.jpg"),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
            )

            Box(
                modifier = Modifier.width(10.dp)
            )

            Column {
                Text(text = "S. M. Asif", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = "Senior software engineer", fontSize = 14.sp)

            }
        }

        Box(
            modifier = Modifier.height(10.dp)
        )


        Text(text = "Address: Dhaka, Bangladesh", fontSize = 14.sp, modifier = Modifier.padding(10.dp))


    }
}