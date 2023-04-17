package com.dersarco.tracker_domain.use_case

import com.dersarco.tracker_domain.model.TrackedFood
import com.dersarco.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deletedTrackFood(trackedFood)
    }
}