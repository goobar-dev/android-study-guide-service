package dev.goobar.data

@kotlinx.serialization.Serializable
data class Topic(
    val title: String,
    val categories: List<Category>,
    val content: String
)
