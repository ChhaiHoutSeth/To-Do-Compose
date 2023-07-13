package com.example.to_docompose.ui.data.models

import androidx.compose.ui.graphics.Color
import com.example.to_docompose.ui.theme.highColor
import com.example.to_docompose.ui.theme.lowColor
import com.example.to_docompose.ui.theme.mediumColor
import com.example.to_docompose.ui.theme.noneColor

enum class Priority(val color: Color) {
    HIGH(highColor),
    MEDIUM(mediumColor),
    LOW(lowColor),
    NONE(noneColor)
}