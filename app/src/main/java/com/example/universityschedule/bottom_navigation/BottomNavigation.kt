package com.example.universityschedule.bottom_navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.universityschedule.R

@Composable
fun BottomNavigation(
    navController: NavHostController,
    ) {

    val listItems = listOf(
        BottomItem.UniversitySchedule,
        BottomItem.Tasks,
        BottomItem.Lessons,
    )

    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Color.White,
        contentColor = Color.Gray
    ) {


        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        listItems.forEach { item ->

            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        modifier = Modifier.size(20.dp),
                        contentDescription = "Icon",
                        
                    )
                },
                label = { Text(
                    text = item.title,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold
                ) },

                colors = NavigationBarItemColors(
                    selectedIconColor = colorResource(R.color.selectedBottom),
                    selectedTextColor = colorResource(R.color.selectedBottom),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray,
                    selectedIndicatorColor = Color.White,
                    disabledIconColor = Color.White,
                    disabledTextColor = Color.White
                )

            )
        }




    }

}