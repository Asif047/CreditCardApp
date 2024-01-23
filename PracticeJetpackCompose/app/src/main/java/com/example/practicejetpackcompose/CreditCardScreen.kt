package com.example.practicejetpackcompose

import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val salsaFamily = FontFamily(
    Font(R.font.salsa),
)

val vollkornFamily = FontFamily(
    Font(R.font.vollkorn),
)

val breeSerifFamily = FontFamily(
    Font(R.font.breesherif),
)

@Composable
fun CreditCardScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {


        Column(
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
                .align(Alignment.TopStart)
        ) {
            Row() {
                Image(painter = painterResource(R.drawable.ic_back), contentDescription = "aaa")

                Box(modifier = Modifier.width(10.dp)) {

                }
                Text(
                    text = "Checkout",
                    fontSize = 16.sp,
                    fontFamily = salsaFamily,
                    fontWeight = FontWeight.ExtraBold
                )
            }

            Box(modifier = Modifier.height(10.dp)) {

            }

            Text(
                text = "Items",
                fontSize = 14.sp,
                modifier = Modifier.padding(4.dp),
                fontWeight = FontWeight.Medium,
                fontFamily = breeSerifFamily
            )

            Box() {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = (8).dp, y = (8).dp)
                        .padding(end = 10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.user1),
                            contentDescription = "New card",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .padding(2.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )

                        Box(modifier = Modifier.width(20.dp))

                        Column(modifier = Modifier.padding(2.dp)) {
                            Text(
                                text = " Polo shirt - men",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = breeSerifFamily
                            )
                            Text(text = " Color: Gray", fontSize = 10.sp, fontFamily = FontFamily.Monospace)
                            Text(text = " Size: M", fontSize = 10.sp, fontFamily = FontFamily.Monospace)
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = " Price: 25 $",
                                    fontSize = 10.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.ExtraBold,
                                    fontFamily = breeSerifFamily
                                )
                            }
                        }
                    }


                }


                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .background(color = Color.Red, shape = CircleShape)
                        .padding(4.dp)
                        .offset(x = (10).dp, y = (-10).dp)
                        .align(Alignment.TopEnd)

//                .align(Alignment.TopEnd)
                    // Negative offset to position the icon outside the card
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_eye_close),
                        contentDescription = "",
                        modifier = Modifier
                            .size(26.dp)
                            .offset(x = (-10).dp, y = (10).dp).padding(4.dp)

                    )
                }

            }

            Text(
                text = "Payment Method",
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 10.dp, top = 24.dp),
                fontWeight = FontWeight.Medium,
                fontFamily = breeSerifFamily
            )

            Box(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(color = Color.Blue, shape = CircleShape)
                    ) {

                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_credit_card),
                            contentDescription = ""
                        )

                    }

                    Text(text = "Credit card", fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily)
                }


                Box(modifier = Modifier.width(20.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(color = Color.LightGray, shape = CircleShape)
                    ) {

                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_apple_pay),
                            contentDescription = ""
                        )

                    }

                    Text(text = "Apple Pay", fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily)

                }


                Box(modifier = Modifier.width(20.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(color = Color.LightGray, shape = CircleShape)
                    ) {
                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_g_pay),
                            contentDescription = ""
                        )
                    }

                    Text(text = "Google Pay", fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily)
                }

                Box(modifier = Modifier.width(20.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .align(Alignment.CenterHorizontally)
                            .background(color = Color.LightGray, shape = CircleShape)
                    ) {
                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_paypal),
                            contentDescription = ""
                        )
                    }

                    Text(
                        text = "PayPal",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily
                    )
                }

            }


            Text(
                text = "Saved cards",
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 10.dp, top = 24.dp),
                fontWeight = FontWeight.Medium,
                fontFamily = breeSerifFamily
            )


            AutoSliding()

        }

        Column(
            modifier = Modifier.align(Alignment.BottomCenter),
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_caution),
                    contentDescription = "icon caution"
                )

                Box(modifier = Modifier.width(10.dp))
                Text(text = "All payment methods are secure and encrypted", fontSize = 10.sp)
            }

            Button(
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
                Text(text = "Continue", fontFamily = salsaFamily, fontWeight = FontWeight.Bold)
            }

        }


    }

}


@Preview(showBackground = true, heightDp = 1000, widthDp = 300)
@Composable
fun CreditCardScreenPreview() {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {


        Column(
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
                .align(Alignment.TopStart)
        ) {
            Row() {
                Image(painter = painterResource(R.drawable.ic_back), contentDescription = "aaa")

                Box(modifier = Modifier.width(10.dp)) {

                }
                Text(
                    text = "Checkout",
                    fontSize = 16.sp,
                    fontFamily = salsaFamily,
                    fontWeight = FontWeight.ExtraBold
                )
            }

            Box(modifier = Modifier.height(10.dp)) {

            }

            Text(
                text = "Items",
                fontSize = 14.sp,
                modifier = Modifier.padding(4.dp),
                fontWeight = FontWeight.Medium,
                fontFamily = breeSerifFamily
            )

            Box() {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = (8).dp, y = (8).dp)
                        .padding(end = 10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.user1),
                            contentDescription = "New card",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(60.dp)
                                .padding(2.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )

                        Box(modifier = Modifier.width(20.dp))

                        Column(modifier = Modifier.padding(2.dp)) {
                            Text(
                                text = " Polo shirt - men",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = breeSerifFamily
                            )
                            Text(text = " Color: Gray", fontSize = 10.sp, fontFamily = FontFamily.Monospace)
                            Text(text = " Size: M", fontSize = 10.sp, fontFamily = FontFamily.Monospace)
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = " Price: 25 $",
                                    fontSize = 10.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.ExtraBold,
                                    fontFamily = breeSerifFamily
                                )
                            }
                        }
                    }


                }


                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .background(color = Color.Red, shape = CircleShape)
                        .padding(4.dp)
                        .offset(x = (10).dp, y = (-10).dp)
                        .align(Alignment.TopEnd)

//                .align(Alignment.TopEnd)
                    // Negative offset to position the icon outside the card
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_eye_close),
                        contentDescription = "",
                        modifier = Modifier
                            .size(26.dp)
                            .offset(x = (-10).dp, y = (10).dp).padding(4.dp)

                    )
                }

            }

            Text(
                text = "Payment Method",
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 10.dp, top = 24.dp),
                fontWeight = FontWeight.Medium,
                fontFamily = breeSerifFamily
            )

            Box(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(color = Color.Blue, shape = CircleShape)
                    ) {

                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_credit_card),
                            contentDescription = ""
                        )

                    }

                    Text(text = "Credit card", fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily)
                }


                Box(modifier = Modifier.width(20.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(color = Color.LightGray, shape = CircleShape)
                    ) {

                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_apple_pay),
                            contentDescription = ""
                        )

                    }

                    Text(text = "Apple Pay", fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily)

                }


                Box(modifier = Modifier.width(20.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(color = Color.LightGray, shape = CircleShape)
                    ) {
                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_g_pay),
                            contentDescription = ""
                        )
                    }

                    Text(text = "Google Pay", fontSize = 10.sp, fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily)
                }

                Box(modifier = Modifier.width(20.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .align(Alignment.CenterHorizontally)
                            .background(color = Color.LightGray, shape = CircleShape)
                    ) {
                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.ic_paypal),
                            contentDescription = ""
                        )
                    }

                    Text(
                        text = "PayPal",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold, fontFamily = vollkornFamily
                    )
                }

            }


            Text(
                text = "Saved cards",
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 10.dp, top = 24.dp),
                fontWeight = FontWeight.Medium,
                fontFamily = breeSerifFamily
            )


            AutoSliding()

        }

        Column(
            modifier = Modifier.align(Alignment.BottomCenter),
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_caution),
                    contentDescription = "icon caution"
                )

                Box(modifier = Modifier.width(10.dp))
                Text(text = "All payment methods are secure and encrypted", fontSize = 10.sp)
            }

            Button(
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
                Text(text = "Continue", fontFamily = salsaFamily, fontWeight = FontWeight.Bold)
            }

        }


    }


}