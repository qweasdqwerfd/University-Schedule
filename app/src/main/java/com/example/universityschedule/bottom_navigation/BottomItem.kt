package com.example.universityschedule.bottom_navigation

import com.example.universityschedule.R

sealed class BottomItem(
    val title: String,
    val icon: Int,
    val route: String
) {

    object UniversitySchedule: BottomItem("University Schedule", R.drawable.calendar, "calendar")
    object Tasks: BottomItem("Tasks", R.drawable.tasks, "tasks")
    object Lessons: BottomItem("lessons", R.drawable.lessons, "lessons")
}