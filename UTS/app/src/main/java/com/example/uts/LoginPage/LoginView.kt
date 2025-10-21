package com.example.uts.LoginPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainLogin(navController : NavController, modifier: Modifier){
    LoginView(modifier)
}

@Composable
fun LoginView(modifier: Modifier = Modifier) {
    Box (modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)){
        LoginForm()
    }
}

@Composable
fun LoginForm(){
    val textFieldModifier : Modifier = Modifier
        .padding(vertical = 10.dp)
        .fillMaxWidth(0.8f)
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column (modifier = Modifier.padding(vertical = 15.dp)){
            Text("Username")
            TextField(
                modifier = textFieldModifier,
                value = username,
                onValueChange = { it -> username = it },
                placeholder = { Text("Username", color = Color.Gray) }
            )
        }

        Column (modifier = Modifier.padding(vertical = 15.dp)){
            Text("Password")
            TextField(
                modifier = textFieldModifier,
                value = password,
                onValueChange = { it -> password = it },
                placeholder = { Text("Password", color = Color.Gray) }
            )
        }

        SubmitLogin()
    }
}

@Composable
fun SubmitLogin(){
    ElevatedButton(onClick = {}) {
        Text("Login")
    }
}

@Preview
@Composable
fun PreviewLogin(){
    LoginView()
}