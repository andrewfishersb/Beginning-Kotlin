
fun main(args : Array<String>){

        feedTheFish()

    println(canAddMoreFish(10.0, listOf(3,3,3)))
    println(canAddMoreFish(8.0, listOf(2,2,2),hasDecorations = false))
    println(canAddMoreFish(9.0, listOf(3,3,3),3))
    println(canAddMoreFish(10.0, listOf(),7,true))

}

fun shouldChangeWater(day: String, temperature : Int = 22, dirty : Int = 20):Boolean{
    return true

}

fun canAddMoreFish(tankSize : Double, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean {

    return (tankSize * if(hasDecorations) .8 else .1) >= (currentFish.sum() + fishSize)

}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish will eat $food")
    if(shouldChangeWater(day)){
        println("Should change the water today")
    }
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