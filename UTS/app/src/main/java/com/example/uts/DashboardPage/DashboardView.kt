package com.example.uts.DashboardPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uts.ui.theme.Add

@Composable
fun MainDashboard(navController: NavController, modifier: Modifier = Modifier){
    DashboardView(modifier = modifier)
}

@Composable
fun DashboardView(modifier: Modifier = Modifier
    .fillMaxSize()
    .background(MaterialTheme.colorScheme.background)
) {
    Scaffold (
        modifier = modifier,
        floatingActionButton =  {
            FloatingActionButton(onClick = {}){
                Icon(imageVector = Add, contentDescription = "Add Student")
            }
        }
        ) { innerPadding ->
        StudentCard(
            "Marcella",
            "1313623031",
            modifier.padding(innerPadding
        )) //dummy
    }
}

@Composable
fun StudentCard(name: String, id : String, modifier: Modifier = Modifier){
    OutlinedCard (modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp)){
        Row {
            Column(modifier = Modifier.padding(25.dp)) {
                Text(
                    modifier = Modifier.padding(bottom = 10.dp),
                    text = "$name",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Text("$id")

            }
        }
    }
}

@Preview
@Composable
fun PreviewDashboard(){
    DashboardView()
}