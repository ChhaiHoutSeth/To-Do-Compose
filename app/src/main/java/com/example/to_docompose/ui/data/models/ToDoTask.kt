package com.example.to_docompose.ui.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.to_docompose.ui.util.Constant

@Entity(tableName = Constant.DATABASE_NAME)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var priority: Priority
)