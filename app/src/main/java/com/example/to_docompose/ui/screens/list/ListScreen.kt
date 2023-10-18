package com.example.to_docompose.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_docompose.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListScreen(
    navigationToTaskScreen: (Int) -> Unit
) {
    Scaffold(
        content = {},
        floatingActionButton = {
            ListFab(onFabClicked = navigationToTaskScreen)
        }
    )
}

@Composable
fun ListFab(
    onFabClicked: (Int) -> Unit
) {
    FloatingActionButton(onClick = { onFabClicked(-1) }) {
        Icon(
            imageVector = Icons.Filled.Add,
            tint = Color.White,
            contentDescription = stringResource(id = R.string.add_button)
        )
    }
}

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(navigationToTaskScreen = {})
}