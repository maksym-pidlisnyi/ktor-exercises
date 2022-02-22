package com.mcompany

import com.mcompany.base.configureRoutingAndSerialization
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.mcompany.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRoutingAndSerialization()
        configureSecurity()
        configureMonitoring()
    }.start(wait = true)
}
