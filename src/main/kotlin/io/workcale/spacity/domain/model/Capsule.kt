package io.workcale.spacity.domain.model

data class Capsule(
    val id: CapsuleId,
    val serial: String,
    val status: String,
    val originalLaunch: String,
    val flight: String,
    val type: String
)
