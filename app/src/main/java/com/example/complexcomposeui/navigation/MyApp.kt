package com.example.complexcomposeui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.complexcomposeui.view.LazyRowWithAlternatingOffsetButtons
import com.example.complexcomposeui.view.ListOfOptionDemo

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Bubbles.route
    ){
        composable(route = Screen.Bubbles.route) { LazyRowWithAlternatingOffsetButtons(navController) }
        composable(route = Screen.Options.route) { ListOfOptionDemo(navController) }
    }
}