package dev.goobar.data

@kotlinx.serialization.Serializable
enum class Category(val title: String) {
    ANDROID("Android"),
    KOTLIN("Kotlin"),
    DEVELOPMENT("Software Development"),
    CLOUD("Cloud"),
    SOURCE_CONTROL("Source Control")
}