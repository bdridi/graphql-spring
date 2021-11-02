package io.workcale.spacity.domain

import io.workcale.spacity.domain.model.Capsule
import io.workcale.spacity.domain.model.Mission

interface CapsuleOutputPort {
    fun getCapsules(mission: Mission): List<Capsule>
}