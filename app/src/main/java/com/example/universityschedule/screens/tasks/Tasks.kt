package com.example.universityschedule.screens.tasks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.universityschedule.castom_components.IconButton.AddTaskButton
import com.example.universityschedule.screens.TabRowPager
import com.example.universityschedule.screens.tasks.tasks_tabs.ActiveTabTasks
import com.example.universityschedule.screens.tasks.tasks_tabs.AllTabTasks
import com.example.universityschedule.screens.tasks.tasks_tabs.CompletedTabTasks

@Composable
fun Tasks(
    navHostController: NavHostController
) {


    TabRowPager(
        tabs = listOf("All", "Active", "Completed"),
        pages = listOf(
            { AllTabTasks() },
            { ActiveTabTasks() },
            { CompletedTabTasks() }
        ),
    )

    AddTaskButton {
        navHostController.navigate("addNewTask")
    }




}