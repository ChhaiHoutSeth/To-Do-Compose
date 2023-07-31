package com.example.to_docompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.to_docompose.util.Constant

@Entity(tableName = Constant.TABLE_NAME)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var priority: Priority
)