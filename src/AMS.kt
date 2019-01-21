import java.util.*
import kotlin.random.Random

fun main(args : Array<String>){

        feedTheFish()



}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish will eat $food")
}

fun randomDay() : String{
    val weekdays = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    return weekdays.random()
}

fun fishFood(day : String) : String{


    return when(day){
        "Monday" ->  "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}