package nl.anengie.cookieparty.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import nl.anengie.cookieparty.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuzzerScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            stringResource(id = R.string.app_name),
                            color = Color.White,
                            style = typography.headlineMedium
                        )
                    }
                },
                colors = topAppBarColors(
                    containerColor = Color.Red
                )
            )
        },
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
                style = typography.headlineMedium
            )
        }

        PlayerCard()

        Row {
            Button(
                modifier = Modifier
                    .padding(8.dp),
                onClick = {

                }
            ) {
                Text(
                    text = "Add player"
                )
            }

            Button(
                modifier = Modifier
                    .padding(8.dp),
                onClick = {

                }
            ) {
                Text(
                    text = "Delete player"
                )
            }
        }
    }
}

@Composable
private fun PlayerCard() {
    Card(
        modifier = Modifier
            .size(width = 380.dp, height = 125.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .padding(16.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = stringResource(id = R.string.placeholder_player)
            )
            Text(
                stringResource(id = R.string.placeholder_player),
                style = typography.headlineMedium,
            )
        }
    }
}