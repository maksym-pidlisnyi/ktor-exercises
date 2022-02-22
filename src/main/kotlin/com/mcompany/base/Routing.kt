package com.mcompany.base

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.plugins.*
import io.ktor.server.routing.*

fun Application.configureRoutingAndSerialization() {
    install(Locations)
    install(Routing)
    install(AutoHeadResponse)
    install(ContentNegotiation) {
        json()
    }

    routing {
        // TODO
    }
}