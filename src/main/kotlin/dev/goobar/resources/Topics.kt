package dev.goobar.resources

import io.ktor.resources.*
import kotlinx.serialization.Serializable

@Serializable
@Resource("/topics")
class Topics()