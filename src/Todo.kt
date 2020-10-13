fun main() {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String,
                       weather: String="sunny",
                       temperature: Int = 24): String {
    return when (mood) {
        "happy"-> "Go for a walk."
        "sad" -> "Read the Bible."
        "hungry" -> "Cook food."
        else -> "Start work."
    }
}