package com.plcoding.calorytracker.navigation

import androidx.navigation.NavController
import com.dersarco.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}