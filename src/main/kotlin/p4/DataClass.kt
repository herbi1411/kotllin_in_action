package p4

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client (name=${name}, postalcode=${postalCode})"
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override  fun hashCode() : Int = name.hashCode() * 31 + postalCode
}


fun main() {
    val client1 = Client("오현석", 4122)
    val client2 = Client("오현석", 4122)

    //toString
    println(client1)

    //equals
    println(client1 == client2)
    println(client1 === client2)

    //hashCode
     val processed = hashSetOf(Client("오현석", 4122))
    println(processed.contains(Client("오현석", 4122)))
}