package nl.anengie.cookieparty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import nl.anengie.cookieparty.ui.theme.CookiePartyTheme
import androidx.navigation.compose.rememberNavController
import nl.anengie.cookieparty.ui.screens.BuzzerScreen
import nl.anengie.cookieparty.ui.screens.CookieScreens

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CookiePartyTheme {
                CookieApp()
            }
        }
    }
}

@Composable
fun CookieApp() {
    val navController = rememberNavController()

    NavigationHost(navController)
}

@Composable
private fun NavigationHost(
    navController: NavHostController,
) {
    NavHost(
        navController,
        startDestination = CookieScreens.BuzzerScreen.route,
    ) {
        composable(CookieScreens.BuzzerScreen.route) { BuzzerScreen(navController) }
    }
}