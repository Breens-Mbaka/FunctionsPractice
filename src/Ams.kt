import java.util.*

//The main is the entry point of execution
fun main() {
    dayOfWeek()
    val day: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    //checking the day then print the day of the week
    val dayWeek = when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wenesday"
        5 -> "Thursday"
        6 -> "Friday"
        else -> "Sunday"
    }
    println(dayWeek)
}

fun dayOfWeek() {
    println("What day is it today?")
}