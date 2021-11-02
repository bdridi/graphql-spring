package io.workcale.spacity.domain

import io.workcale.spacity.domain.model.Capsule
import io.workcale.spacity.domain.model.Mission

interface CapsuleInputPort {
    fun getCapsules(mission: Mission): List<Capsule>
}