package nl.anengie.cookieparty.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun BuzzerScreen(navController: NavController) {
    Scaffold(
        content = { innerPadding ->
            Modifier.padding(innerPadding)
            ScreenContent(innerPadding, navController)
        }
    )
}


@Composable
private fun ScreenContent(paddingValues: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(
                    top = 8.dp
                )
        ) {
            Text(
                text = "Hello World!",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}
