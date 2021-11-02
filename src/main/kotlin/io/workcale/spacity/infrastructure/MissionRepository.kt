package io.workcale.spacity.infrastructure

import io.workcale.spacity.domain.MissionOutputPort
import io.workcale.spacity.domain.model.CapsuleId
import io.workcale.spacity.domain.model.Mission
import io.workcale.spacity.domain.model.MissionId
import org.springframework.stereotype.Component
import java.util.*

@Component
class MissionRepository : MissionOutputPort {
    override fun getRecentMissions(count: Int, offset: Int): List<Mission> {
        // Database fetching simulation
        val missions = mutableListOf<Mission>()
        for (i in 1..Random().nextInt(100)) {
            missions.add(
                Mission(
                    id = MissionId(UUID.randomUUID().toString()),
                    name = "CREW-$i",
                    manufacturer = "Spacity",
                    website = "workcale.io",
                    capsules = listOf()
                )
            )
        }
        return missions.take(count)
    }

    override fun createMission(name: String, manufacturer: String, website: String): Mission {
        // create a mission in database simulation
        return Mission(
            id = MissionId(UUID.randomUUID().toString()),
            name = name,
            manufacturer = manufacturer,
            website = website,
            capsules = listOf(CapsuleId("capsule1"), CapsuleId("capsule2"))
        )
    }

    override fun getMissionById(id: MissionId): Mission {
        // Find mission by id from database simulation
        return Mission(
            id = id,
            name = "CREW-${Random().nextInt(10)}",
            manufacturer = "Spacity",
            website = "workcale.io",
            capsules = listOf()
        )
    }
}