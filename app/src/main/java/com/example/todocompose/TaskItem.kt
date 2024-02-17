package com.example.todocompose

data class TaskItem(
    val time: String,
    val task: String,
    val description: String,
    val setNotification: Boolean
)
