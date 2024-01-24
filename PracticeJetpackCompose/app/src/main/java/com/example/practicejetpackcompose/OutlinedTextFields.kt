package com.example.practicejetpackcompose


import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.TextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextFieldFullName(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(value = text.value,
        onValueChange = { newValue ->
            text.value = newValue
            onValueChanged(newValue.text)
        },
        label = { Text("Full Name") }, placeholder = { Text(text = "Full Name") })
}

@Composable
fun OutlinedTextFieldConfirmPassword(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }
    val passwordVisibility = remember { mutableStateOf(false) }


    OutlinedTextField(value = text.value,
        onValueChange = { newValue ->
            text.value = newValue
            onValueChanged(newValue.text)
        },
        trailingIcon = {
            IconButton(onClick = {
                passwordVisibility.value = !passwordVisibility.value
            }) {
                Icon(
                    painter = if (passwordVisibility.value){
                        painterResource(R.drawable.ic_eye_close)
                    } else{
                        painterResource(R.drawable.ic_eye_open)
                    },
                    contentDescription = "Account Icon"
                )
            }
        },
        visualTransformation = if (passwordVisibility.value) VisualTransformation.None
        else PasswordVisualTransformation(),
        label = { Text("Confirm Password") }, placeholder = { Text(text = "Confirm Password")})
}

@Composable
fun OutlinedTextFieldPhone(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(value = text.value,
        onValueChange = { newValue ->
            text.value = newValue
            onValueChanged(newValue.text)
        },
        label = { Text("Mobile No.") }, placeholder = { Text(text = "Mobile no.") })
}


@Composable
fun OutlinedTextFieldEmail(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(value = text.value,
        onValueChange = { newValue ->
            text.value = newValue
            onValueChanged(newValue.text)
        },
        label = { Text("Email") }, placeholder = { Text(text = "Email") })
}

@Composable
fun OutlinedTextFieldPassword(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }
    val passwordVisibility = remember { mutableStateOf(false) }


    OutlinedTextField(value = text.value,
        onValueChange = { newValue ->
            text.value = newValue
            onValueChanged(newValue.text)
        },
        trailingIcon = {
            IconButton(onClick = {
                passwordVisibility.value = !passwordVisibility.value
            }) {
                Icon(
                    painter = if (passwordVisibility.value) {
                        painterResource(R.drawable.ic_eye_close)
                    } else {
                        painterResource(R.drawable.ic_eye_open)
                    },
                    contentDescription = "Account Icon"
                )
            }
        },
        visualTransformation = if (passwordVisibility.value) VisualTransformation.None
        else PasswordVisualTransformation(),
        label = { Text("Password") }, placeholder = { Text(text = "Password") })
}


@Composable
fun OutlinedTextFieldCardHolderId(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }

    Card(
        modifier = Modifier
            .height(50.dp) .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        TextField(
            value = text.value,
            onValueChange = {
                text.value = it
                onValueChanged(it.text)
            },
            modifier = Modifier.padding(0.dp).height(60.dp),
            placeholder = {
                Text(
                    text = "* * * * * * * * *",
                    color = Color.Gray
                )
            },
            colors = androidx.compose.material.TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.Black,
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.White
            ),
        )
    }
}

@Composable
fun OutlinedTextFieldCardNumber(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }

    Card(
        modifier = Modifier
            .height(50.dp) .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        TextField(
            value = text.value,
            onValueChange = {
                text.value = it
                onValueChanged(it.text)
            },
            modifier = Modifier.padding(0.dp).height(60.dp),
            placeholder = {
                Text(
                    text = "* * * *   * * * *   * * * *   * * * *",
                    color = Color.Gray
                )
            },
            colors = androidx.compose.material.TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.Black,
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.White
            ),
        )
    }
}



@Composable
fun OutlinedTextFieldCardHolderCVV(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }

    Card(
        modifier = Modifier
            .height(50.dp) .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        TextField(
            value = text.value,
            onValueChange = {
                text.value = it
                onValueChanged(it.text)
            },
            modifier = Modifier.padding(0.dp).height(60.dp),
            placeholder = {
                Text(
                    text = "* * *",
                    color = Color.Gray
                )
            },
            colors = androidx.compose.material.TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.Black,
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.White
            ),
        )
    }
}

@Composable
fun OutlinedTextFieldCardHolderDate(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }

    Card(
        modifier = Modifier
            .height(50.dp) .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        TextField(
            value = text.value,
            onValueChange = {
                text.value = it
                onValueChanged(it.text)
            },
            modifier = Modifier.padding(0.dp).height(60.dp),
            placeholder = {
                Text(
                    text = "* * / * *",
                    color = Color.Gray
                )
            },
            colors = androidx.compose.material.TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.Black,
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.White
            ),
        )
    }
}


@Composable
fun OutlinedTextFieldCardHolderName(onValueChanged: (String) -> Unit) {
    val text = remember { mutableStateOf(TextFieldValue("")) }

    Card(
        modifier = Modifier
            .height(50.dp) .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        TextField(
            value = text.value,
            onValueChange = {
                text.value = it
                onValueChanged(it.text)
            },
            modifier = Modifier.padding(0.dp).height(60.dp),
            placeholder = {
                Text(
                    text = "",
                    color = Color.Gray
                )
            },
            colors = androidx.compose.material.TextFieldDefaults.textFieldColors(
                unfocusedLabelColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.Black,
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.White
            ),
        )
    }
}




