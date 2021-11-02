package io.workcale.spacity.application.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import io.workcale.spacity.domain.model.Mission
import io.workcale.spacity.domain.MissionInputPort
import org.springframework.stereotype.Component

@Component
class MissionMutation(
    private val missionInputPort: MissionInputPort
): GraphQLMutationResolver
{
    fun createMission(name: String, manufacturer: String, website: String): Mission {
        return missionInputPort.createMission(name, manufacturer, website)
    }
}