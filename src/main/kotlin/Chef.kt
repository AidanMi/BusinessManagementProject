import java.text.DecimalFormat

class Chef (var headChef:Boolean, place:Restaurant, payRate:Double, name:String, phoneNumber:String):
            RestaurantEmployee(place, payRate, name, phoneNumber) {

    init {

    }

    fun calculatePay(hoursWorked:Double) {
        if (headChef==false) {
            var totalPay = payRate * hoursWorked
            println(
                        "Name: $name\n" +
                        "Phone number: $phoneNumber\n" +
                        "Restaurant: ${place.address}\n" +
                        "This Weeks Pay: ${format(totalPay)}"
            )
        }
        else{
            var totalPay = payRate*hoursWorked + payRate*hoursWorked*0.2
        }
    }
}