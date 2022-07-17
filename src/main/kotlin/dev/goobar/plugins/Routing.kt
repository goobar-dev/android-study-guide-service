package dev.goobar.plugins

import dev.goobar.data.SAMPLE_TOPICS
import dev.goobar.resources.Topics
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.resources.*

fun Application.configureRouting() {

    install(Resources)

    routing {
        get<Topics> {
            call.respond(SAMPLE_TOPICS)
        }
    }

}
