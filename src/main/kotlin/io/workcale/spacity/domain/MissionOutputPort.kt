package io.workcale.spacity.domain

import io.workcale.spacity.domain.model.Mission
import io.workcale.spacity.domain.model.MissionId

interface MissionOutputPort {
    fun getRecentMissions(count: Int, offset: Int): List<Mission>
    fun createMission(name: String, manufacturer: String, website: String): Mission
    fun getMissionById(id: MissionId): Mission
}