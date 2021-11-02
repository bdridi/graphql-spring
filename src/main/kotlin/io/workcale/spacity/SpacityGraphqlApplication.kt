package io.workcale.spacity

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpacityGraphqlApplication

fun main(args: Array<String>) {
    runApplication<SpacityGraphqlApplication>(*args)
}
