package io.workcale.spacity.domain

import io.workcale.spacity.domain.model.Capsule
import io.workcale.spacity.domain.model.Mission
import org.springframework.stereotype.Service

@Service
class CapsuleService(
    val capsuleOutputPort: CapsuleOutputPort
): CapsuleInputPort {
    override fun getCapsules(mission: Mission): List<Capsule> {
        return capsuleOutputPort.getCapsules(mission)
    }
}