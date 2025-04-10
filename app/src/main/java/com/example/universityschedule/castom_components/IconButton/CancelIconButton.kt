package com.example.universityschedule.castom_components.IconButton

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.universityschedule.R

@Composable
fun CancelIconButton(
    onClick: () -> Unit
) {

    IconButton(
        onClick = onClick
    ) {
        Icon(
            painter = painterResource(R.drawable.cancel),
            tint = Color.Black,
            contentDescription = "cancel",
            modifier = Modifier
                .size(24.dp)
                .offset(x = 5.dp),
        )
    }

}