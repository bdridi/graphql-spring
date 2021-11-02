package io.workcale.spacity.domain.model

data class Mission(
    val id: MissionId,
    val name: String,
    val manufacturer: String,
    val website: String,
    val capsules: List<CapsuleId>
)
