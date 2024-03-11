fun main() {
    val user = user {
        name = "Name"
        id = 123
        address {
            zipCode = "1362"
            city = "Dhaka"
        }
    }

    println(user)
}

private fun user(init: User.() -> Unit): User {
    val user = User()
    user.init()
    return user
}

private fun User.address(init: Address.() -> Unit) {
    address = Address().apply { init() }
}