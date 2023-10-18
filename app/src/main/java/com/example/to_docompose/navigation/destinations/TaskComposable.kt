package com.example.to_docompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_docompose.util.Action
import com.example.to_docompose.util.Constant

class TaskComposable {
}

fun NavGraphBuilder.taskComposable(navigationToListScreen: (Action) -> Unit) {
    composable(
        route = Constant.TASK_SCREEN,
        arguments = listOf(navArgument(Constant.TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {

    }
}