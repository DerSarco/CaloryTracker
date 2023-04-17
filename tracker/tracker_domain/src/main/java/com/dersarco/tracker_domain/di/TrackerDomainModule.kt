package com.dersarco.tracker_domain.di

import com.dersarco.core.data.preferences.Preferences
import com.dersarco.tracker_domain.repository.TrackerRepository
import com.dersarco.tracker_domain.use_case.CalculateMealNutrients
import com.dersarco.tracker_domain.use_case.DeleteTrackedFood
import com.dersarco.tracker_domain.use_case.GetFoodsForDate
import com.dersarco.tracker_domain.use_case.SearchFood
import com.dersarco.tracker_domain.use_case.TrackFood
import com.dersarco.tracker_domain.use_case.TrackerUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TrackerDomainModule {

    @ViewModelScoped
    @Provides
    fun provideTrackerUserCases(
        repository: TrackerRepository,
        preferences: Preferences
    ): TrackerUseCases {
        return TrackerUseCases(
            trackFood = TrackFood(repository),
            searchFood = SearchFood(repository),
            getFoodsForDate = GetFoodsForDate(repository),
            deleteTrackedFood = DeleteTrackedFood(repository),
            calculateMealNutrients = CalculateMealNutrients(preferences)
        )
    }
}