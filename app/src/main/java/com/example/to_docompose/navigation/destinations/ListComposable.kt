package com.example.to_docompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_docompose.util.Constant.LIST_ARGUMENT_KEY
import com.example.to_docompose.util.Constant.LIST_SCREEN

fun NavGraphBuilder.listComposable(navigationToTaskScreen: (Int) -> Unit) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {

    }
}