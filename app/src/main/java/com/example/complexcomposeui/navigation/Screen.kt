package com.example.complexcomposeui.navigation

import com.example.complexcomposeui.navigation.NavRoutes.BUBBLES
import com.example.complexcomposeui.navigation.NavRoutes.OPTIONS

sealed class Screen(val route: String) {
    object Bubbles: Screen(BUBBLES)
    object Options: Screen(OPTIONS)
}