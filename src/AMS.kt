import java.util.*
import kotlin.random.Random

fun main(args : Array<String>){
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish will eat $food")
}

fun randomDay() : String{
    val weekdays = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    return weekdays.random()
}