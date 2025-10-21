package com.example.uts.AddStudentPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.uts.ui.theme.Add


//MY TO DO LIST :
//Add Student Form Screen consist of
//–
//Student ID Text Field
//–
//Student Name Text Field
//–
//Student Phone Text Field
//–
//Student Address Text Field
//– Register button

@Composable
fun MainAddStudent(navController: NavController, modifier : Modifier = Modifier){
    AddStudentView(modifier = modifier)
}

@Composable
fun AddStudentView(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AddStudentForm()
    }
}

val myStudentList = AddStudentModel()

@Composable
fun AddStudentForm(){
    var id by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }

    val myModifier : Modifier = Modifier.padding(vertical = 10.dp)

    Column (horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            modifier = myModifier,
            value = id,
            placeholder = {Text("Enter your Id", color = Color.Gray)},
            onValueChange = { it -> id = it })

        TextField(
            modifier = myModifier,
            value = name,
            placeholder = {Text("Enter your Id", color = Color.Gray)},
            onValueChange = { it -> name = it })

        TextField(
            modifier = myModifier,
            value = phone,
            placeholder = {Text("Enter your Id", color = Color.Gray)},
            onValueChange = { it -> phone = it })
        
        TextField(
            modifier = myModifier,
            value = address,
            placeholder = {Text("Enter your Id", color = Color.Gray)},
            onValueChange = { it -> address = it })

        RegisterBtn()
    }

}

@Composable
fun RegisterBtn(){
    ElevatedButton(onClick = {},
        modifier = Modifier.padding(vertical = 20.dp),
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        )) {
        Text("Register")
    }
}


@Preview
@Composable
fun PreviewAddSti(){
    AddStudentView()
}