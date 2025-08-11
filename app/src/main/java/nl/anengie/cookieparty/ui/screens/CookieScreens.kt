package nl.anengie.cookieparty.ui.screens

/**
 * Screen metadata for CookieParty app.
 */

sealed class CookieScreens(
    val route: String,
) {
    object BuzzerScreen :
        CookieScreens("buzzer")

    object GamblingScreen :
        CookieScreens("gambling")

}