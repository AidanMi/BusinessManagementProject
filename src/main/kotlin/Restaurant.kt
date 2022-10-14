open class Restaurant(var address:String, var weeklyRevenue:Double, var name:String){
    init {

    }

    fun getRestaurantInfo(){
        println("Restaurant Name: $name\n" +
                "Address: $address\n" +
                "Revenue: $weeklyRevenue\n" +
                "---------------------------------------")
    }
}