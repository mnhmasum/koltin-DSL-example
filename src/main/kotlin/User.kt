data class User(var name: String = "", var id: Int = 0, var address: Address = Address())
data class Address(var zipCode: String = "", var city: String = "")