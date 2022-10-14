import java.text.DecimalFormat

class Waiter constructor(var tips:Double, place:Restaurant, payRate:Double, name:String, phoneNumber:String):
                        RestaurantEmployee(place, payRate, name, phoneNumber){
    val moneyFormat = DecimalFormat("$#,###.00")
    init {

    }

    fun calculatePay(hoursWorked:Double){
        var totalPay = payRate*hoursWorked + tips
        println("Name: $name\n" +
                "Phone number: $phoneNumber\n" +
                "Restaurant: ${place.address}\n" +
                "This Weeks Pay: ${format(totalPay)}")
    }
}