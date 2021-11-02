package io.workcale.spacity.domain

import io.workcale.spacity.domain.model.Mission
import io.workcale.spacity.domain.model.MissionId
import org.springframework.stereotype.Service

@Service
class MissionService(
    val missionOutputPort: MissionOutputPort,
) : MissionInputPort {
    override fun getRecentMissions(count: Int, offset: Int): List<Mission> {
        return missionOutputPort.getRecentMissions(count, offset)
    }

    override fun createMission(name: String, manufacturer: String, website: String): Mission {
        return missionOutputPort.createMission(
            name = name,
            manufacturer = manufacturer,
            website = website
        )
    }

    override fun getMissionById(id: MissionId): Mission {
        return missionOutputPort.getMissionById(id)
    }
}