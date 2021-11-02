package io.workcale.spacity.infrastructure

import io.workcale.spacity.domain.CapsuleOutputPort
import io.workcale.spacity.domain.model.Capsule
import io.workcale.spacity.domain.model.CapsuleId
import io.workcale.spacity.domain.model.Mission
import org.springframework.stereotype.Component
import java.util.*

@Component
class CapsuleRepository: CapsuleOutputPort {

    // Database fetching simulation
    override fun getCapsules(mission: Mission): List<Capsule> {
        val capsules = mutableListOf<Capsule>()
        val status = listOf("active", "inactive", "ready")
        val random = Random()
        for(i in 1..Random().nextInt(3)){
            capsules.add(
                Capsule(
                    id = CapsuleId(UUID.randomUUID().toString()),
                    serial = UUID.randomUUID().toString().substring(0, 6),
                    status = status[random.nextInt(3)],
                    flight = "Flight${random.nextInt()}",
                    type = "${random.nextInt()}",
                    originalLaunch = "test"
                )
            )
        }
        return capsules
    }
}