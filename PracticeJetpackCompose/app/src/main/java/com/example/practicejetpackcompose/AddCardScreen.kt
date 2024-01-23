package com.example.practicejetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddCardScreen() {

    var cardIdText = remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {
        Row() {
            Image(painter = painterResource(R.drawable.ic_back), contentDescription = "aaa")

            Box(modifier = Modifier.width(10.dp)) {

            }
            Text(
                text = "Add new card",
                fontSize = 16.sp,
                fontFamily = salsaFamily,
                fontWeight = FontWeight.ExtraBold
            )
        }

        Box(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(Color(0xFF1B33B8)),
            elevation = CardDefaults.cardElevation(20.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painterResource(id = R.drawable.ic_camera),
                    contentDescription = "camera",
                    modifier = Modifier.size(50.dp)
                )

                Text(
                    text = "Scan card to easy fill",
                    color = Color.White,
                    fontFamily = breeSerifFamily,
                    fontSize = 12.sp
                )
            }

        }


        Box(modifier = Modifier.height(14.dp))
        Text(
            text = "Card holder full name",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = breeSerifFamily
        )

        Box(modifier = Modifier.height(6.dp))

        OutlinedTextFieldCardHolderName { value ->
            cardIdText.value = value
        }

        Box(modifier = Modifier.height(14.dp))
        Text(
            text = "Card holder ID",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = breeSerifFamily
        )

        Box(modifier = Modifier.height(6.dp))

        OutlinedTextFieldCardHolderId { value ->
            cardIdText.value = value
        }

        Box(modifier = Modifier.height(14.dp))
        Text(
            text = "Card Number",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = breeSerifFamily
        )

        Box(modifier = Modifier.height(6.dp))

        OutlinedTextFieldCardNumber { value ->
            cardIdText.value = value
        }

        Box(modifier = Modifier.height(14.dp))

        Row() {
            Column (modifier = Modifier.weight(1f)){
                Text(
                    text = "CVV",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = breeSerifFamily
                )

                Box(modifier = Modifier.height(6.dp))

                OutlinedTextFieldCardHolderCVV { value ->
                    cardIdText.value = value
                }
            }


            Box(modifier = Modifier.width(10.dp))


            Column (modifier = Modifier.weight(1f)){
                Text(
                    text = "Date",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = breeSerifFamily
                )

                Box(modifier = Modifier.height(6.dp))

                OutlinedTextFieldCardHolderDate { value ->
                    cardIdText.value = value
                }
            }


        }

        Box(modifier = Modifier.height(16.dp))
        Row (horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()){
            Text(text = "Total:  25 $", fontSize = 14.sp, fontFamily = salsaFamily)
        }

        Button(
            enabled = false,
            onClick = {
                // Handle button click
            },
            modifier = Modifier
                .fillMaxWidth() // Make the button take the full width
                .padding(20.dp),

            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp),
            shape = RoundedCornerShape(10.dp),
        ) {
            Text(text = "Pay", fontFamily = salsaFamily, fontWeight = FontWeight.Bold)
        }


    }

}


@Preview(showBackground = true, widthDp = 300, heightDp = 1000)
@Composable
fun AddCardScreenPreview() {

    var cardIdText = remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {
        Row() {
            Image(painter = painterResource(R.drawable.ic_back), contentDescription = "aaa")

            Box(modifier = Modifier.width(10.dp)) {

            }
            Text(
                text = "Add new card",
                fontSize = 16.sp,
                fontFamily = salsaFamily,
                fontWeight = FontWeight.ExtraBold
            )
        }

        Box(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .height(130.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(Color(0xFF1B33B8)),
            elevation = CardDefaults.cardElevation(20.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painterResource(id = R.drawable.ic_camera),
                    contentDescription = "camera",
                    modifier = Modifier.size(50.dp)
                )

                Text(
                    text = "Scan card to easy fill",
                    color = Color.White,
                    fontFamily = breeSerifFamily,
                    fontSize = 12.sp
                )
            }

        }


        Box(modifier = Modifier.height(14.dp))
        Text(
            text = "Card holder full name",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = breeSerifFamily
        )

        Box(modifier = Modifier.height(6.dp))

        Row() {
            OutlinedTextFieldCardHolderName { value ->
                cardIdText.value = value
            }

            Icon(painter = painterResource(id = R.drawable.ic_back), contentDescription = "")
        }


        Box(modifier = Modifier.height(14.dp))
        Text(
            text = "Card holder ID",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = breeSerifFamily
        )

        Box(modifier = Modifier.height(6.dp))

        OutlinedTextFieldCardHolderId { value ->
            cardIdText.value = value
        }

        Box(modifier = Modifier.height(14.dp))
        Text(
            text = "Card Number",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = breeSerifFamily
        )

        Box(modifier = Modifier.height(6.dp))

        OutlinedTextFieldCardNumber { value ->
            cardIdText.value = value
        }

        Box(modifier = Modifier.height(14.dp))

        Row() {
            Column (modifier = Modifier.weight(1f)){
                Text(
                    text = "CVV",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = breeSerifFamily
                )

                Box(modifier = Modifier.height(6.dp))

                OutlinedTextFieldCardHolderCVV { value ->
                    cardIdText.value = value
                }
            }


            Box(modifier = Modifier.width(10.dp))


            Column (modifier = Modifier.weight(1f)){
                Text(
                    text = "Date",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = breeSerifFamily
                )

                Box(modifier = Modifier.height(6.dp))

                OutlinedTextFieldCardHolderDate { value ->
                    cardIdText.value = value
                }
            }


        }

        Box(modifier = Modifier.height(16.dp))
        Row (horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()){
            Text(text = "Total:  25 $", fontSize = 14.sp, fontFamily = salsaFamily)
        }

        Button(
            enabled = false,
            onClick = {
                // Handle button click
            },
            modifier = Modifier
                .fillMaxWidth() // Make the button take the full width
                .padding(20.dp),

            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp),
            shape = RoundedCornerShape(10.dp),
        ) {
            Text(text = "Pay", fontFamily = salsaFamily, fontWeight = FontWeight.Bold)
        }


    }

}