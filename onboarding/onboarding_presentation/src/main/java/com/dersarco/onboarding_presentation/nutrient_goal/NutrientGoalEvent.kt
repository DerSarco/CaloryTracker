package com.dersarco.onboarding_presentation.nutrient_goal

sealed class NutrientGoalEvent {
    data class OnCarbRationEnter(val ratio: String): NutrientGoalEvent()
    data class OnProteinRationEnter(val ratio: String): NutrientGoalEvent()
    data class OnFatRationEnter(val ratio: String): NutrientGoalEvent()
    object OnNextClick: NutrientGoalEvent()
}
