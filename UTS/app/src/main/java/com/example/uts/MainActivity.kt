package com.example.uts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uts.AddStudentPage.MainAddStudent
import com.example.uts.DashboardPage.MainDashboard
import com.example.uts.LoginPage.MainLogin
import com.example.uts.ui.theme.Menu
import com.example.uts.ui.theme.UTSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UTSTheme {
                myApp()
            }
        }
    }
}

object Screen{
    val Login = "Login_Page"
    val AddStudent = "Add_Student_Page"
    val Dasboard = "Dashboard_Page"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myApp() {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {Text("MyApp", modifier = Modifier.padding(start = 12.dp))},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White
                ),
                navigationIcon = {
                    var expanded by remember { mutableStateOf(false) }
                    Box {
                        IconButton(onClick = {expanded = !expanded}) {
                            Icon(
                                imageVector = Menu,
                                contentDescription = "menu app",
                                tint = Color.White
                            )
                        }
                        DropdownMenu(
                            expanded = expanded,
                            onDismissRequest = {expanded = false}
                        ) {
                            DropdownMenuItem(
                                onClick = {},
                                text = { Text("Login") }
                            )
                            DropdownMenuItem(
                                onClick = {},
                                text = { Text("Dashboard") }
                            )

                            DropdownMenuItem(
                                onClick = {},
                                text = { Text("Add Student") }
                            )

                        }
                    }
                }
            )
        }

    ) {
        innerPadding ->
        Navigator(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun Navigator(modifier : Modifier = Modifier){
    val navController = rememberNavController()

    NavHost(
        navController,
        startDestination = Screen.Dasboard
    ){
        composable(Screen.Dasboard) { MainDashboard(navController, modifier) }
        composable(Screen.Login) { MainLogin(navController, modifier = modifier) }
        composable(Screen.AddStudent) { MainAddStudent(navController, modifier) }
    }
}

//@Preview
//@Composable
//fun myPreview(){
//    myApp(navController)
//}

//@Composable
//fun ThemeSwitcherApp() {
//    var isDarkTheme by remember { mutableStateOf(false) }
//
//    MaterialTheme(
//        colorScheme = if (isDarkTheme) darkColorScheme() else lightColorScheme()
//    ) {
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//            color = MaterialTheme.colorScheme.background
//        ) {
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text("Current theme: ${if (isDarkTheme) "Dark" else "Light"}")
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Button(onClick = { isDarkTheme = !isDarkTheme }) {
//                    Text("Toggle Theme")
//                }
//            }
//        }
//    }
//}
