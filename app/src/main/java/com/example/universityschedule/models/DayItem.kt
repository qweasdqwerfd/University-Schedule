package com.example.universityschedule.models

data class DayItem(
    val id: String,       // Уникальный идентификатор (например "2024-03-25")
    val dayName: String,  // "Пн", "Вт" и т.д.
    val date: Int,        // 25, 26 и т.д.
    val month: String,    // "Мар", "Апр" и т.д.
    val isSelected: Boolean = false
)