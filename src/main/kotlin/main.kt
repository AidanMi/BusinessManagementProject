import java.text.DecimalFormat
fun main() {

    var count:Int
    val restaurantList = arrayListOf<Restaurant>()
    val chefList = arrayListOf<Chef>()
    val waiterList = arrayListOf<Waiter>()
    var resCount = 0
    var chefCount = 0
    var waiterCount = 0

    do{
        println("1) Add New Restaurant\n" +
                "2) Add New Employee\n" +
                "3) Calculate Employee Pay\n" +
                "4) Print Restaurant Info\n" +
                "5) Exit")
        count = readln().toInt()

        when(count){
            1 -> {
                println("Address:")
                val x = readln()
                println("Name:")
                val y = readln()
                println("Revenue:")
                val z = readln().toDouble()
                val restaurant = Restaurant(x,z,y)
                restaurantList.add(restaurant)
                resCount++
                println("New Restaurant Added; Restaurant Number = $resCount")
                println("---------------------------------------")
            }
            2 -> {
                println("Employee Type(Chef or Waiter):")
                val t = readln()
                if(t.lowercase() == ("chef")){
                    println("Employee Name: ")
                    val name = readln()
                    println("Is Head Chef(true/false): ")
                    val headChef = readln().toBoolean()
                    println("Employee Phone Number: ")
                    val phoneNum = readln()
                    println("Pay Rate: ")
                    val rate = readln().toDouble()
                    println("Restaurant Number: ")
                    val resNum = readln().toInt()
                    val employee = Chef(headChef, restaurantList[resNum-1], rate, name, phoneNum)
                    chefList.add(employee)
                    chefCount++
                    println("New Employee Added; Chef Number = $chefCount")
                }
                else if(t.lowercase() == ("waiter")){
                    println("Employee Name: ")
                    val name = readln()
                    println("Tip Amount: ")
                    val tips = readln().toDouble()
                    println("Employee Phone Number: ")
                    val phoneNum = readln()
                    println("Pay Rate: ")
                    val rate = readln().toDouble()
                    println("Restaurant Number: ")
                    val resNum = readln().toInt()
                    val employee = Waiter(tips, restaurantList[resNum-1], rate, name, phoneNum)
                    waiterList.add(employee)
                    waiterCount++
                    println("New Employee Added; Waiter Number = $waiterCount")
                }
                else{
                    println("Error")
                }
                println("---------------------------------------")
            }
            3 ->{
                println("Hours Worked: ")
                val hrs = readln().toDouble()
                println("Employee Type(Chef/Waiter): ")
                val t = readln()
                if(t.lowercase() == ("chef")){
                    println("Chef Number: ")
                    val cNum = readln().toInt()
                    chefList[cNum-1].calculatePay(hrs)
                }
                else if (t.lowercase() == ("waiter")){
                    println("Waiter Number: ")
                    val wNum = readln().toInt()
                    waiterList[wNum-1].calculatePay(hrs)
                }
                println("---------------------------------------")
            }
            4 -> {
                println("Restaurant Number: ")
                val restNum = readln().toInt()
                restaurantList[restNum-1].getRestaurantInfo()

            }
        }
    }while(count<5)

}

fun format(amount:Double):String{
    val moneyFormat = DecimalFormat("$#,###.00")
    return moneyFormat.format(amount)
}
