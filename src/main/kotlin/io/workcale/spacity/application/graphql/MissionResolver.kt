package io.workcale.spacity.application.graphql

import com.coxautodev.graphql.tools.GraphQLResolver
import io.workcale.spacity.domain.model.Capsule
import io.workcale.spacity.domain.CapsuleInputPort
import io.workcale.spacity.domain.model.Mission
import org.springframework.stereotype.Component

@Component
class MissionResolver(
    private val capsuleInputPort: CapsuleInputPort
): GraphQLResolver<Mission> {

    fun getCapsules(mission: Mission): List<Capsule>{
        return capsuleInputPort.getCapsules(mission)
    }
}