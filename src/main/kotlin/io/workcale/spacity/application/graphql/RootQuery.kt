package io.workcale.spacity.application.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import io.workcale.spacity.domain.model.Mission
import io.workcale.spacity.domain.model.MissionId
import io.workcale.spacity.domain.MissionInputPort
import org.springframework.stereotype.Component

@Component
class RootQuery(
    private val missionInputPort: MissionInputPort
): GraphQLQueryResolver {
    fun getRecentMissions(count: Int, offset: Int): List<Mission>{
        return missionInputPort.getRecentMissions(count, offset)
    }

    fun getMissionById(id: String): Mission {
        return missionInputPort.getMissionById(MissionId(id))
    }
}