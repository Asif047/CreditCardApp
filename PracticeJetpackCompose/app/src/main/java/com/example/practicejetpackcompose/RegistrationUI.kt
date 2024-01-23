package com.example.practicejetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegistrationUI() {
    val scrollState = rememberLazyListState()
    var emailText = remember { mutableStateOf("") }
    var passwordText = remember { mutableStateOf("") }
    var fullNameText = remember { mutableStateOf("") }
    var confirmPasswordText = remember { mutableStateOf("") }
    var phoneText = remember { mutableStateOf("") }

    LazyColumn(
        state = scrollState,
        modifier = Modifier
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item() {

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.register_page),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = "Image",
                    modifier = Modifier
                        .height(220.dp)
                        .width(180.dp)
                )

            }

        }


        item() {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 30.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    )
                    .background(color = Color(0xFFF8F2F2)),
               // elevation = 20.dp,

                ) {

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 30.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp
                        )
                    )
                    .background(color = Color(0xFFF8F2F2)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedTextFieldFullName { value ->
                        fullNameText.value = value
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedTextFieldEmail { value ->
                        emailText.value = value
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedTextFieldPhone { value ->
                        phoneText.value = value
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedTextFieldPassword { value ->
                        passwordText.value = value
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    OutlinedTextFieldConfirmPassword { value ->
                        confirmPasswordText.value = value
                    }

                    Spacer(modifier = Modifier.padding(20.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                            .height(50.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 10.dp,
                                    topEnd = 10.dp,
                                    bottomStart = 10.dp,
                                    bottomEnd = 10.dp
                                )
                            )
                    ) {
                        Text(text = "Sign Up", fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(250.dp))



                }

            }


        }

    }

    Spacer(modifier = Modifier.height(16.dp))

}
