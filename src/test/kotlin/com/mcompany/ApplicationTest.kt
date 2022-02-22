package com.mcompany

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.sessions.*
import io.ktor.server.locations.*
import io.ktor.server.plugins.*
import io.ktor.server.http.content.*
import org.slf4j.event.*
import io.ktor.server.request.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.mcompany.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ configureRouting() }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello World!", response.content)
            }
        }
    }
}