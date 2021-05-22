package com.costalopes.module5

fun main() {
    val john = LoggedUser(1, "Joao", "Lopes")
    println("${john.getName()}: ${john.id} ${john.tutor}")

    val andrew = LoggedUser(2, "Andre", "Lopes", "Caio")
    println("${andrew.getName()}: ${andrew.id} ${andrew.tutor}")
}

abstract class User(var firstName:String, var lastName: String) {
    open fun getName() = "$firstName $lastName"
    abstract fun getAddress(): String
}

// Here we are using default value for tutor, that way we dont need a secondary constructor
class LoggedUser(val id: Int, firstName: String, lastName: String, var tutor: String = "") : User(firstName, lastName) {
    override fun getAddress(): String = "dummy logged user address"
}

class UnloggedUser(_id: Int, firstName: String, lastName: String) : User(firstName, lastName) {
    val id: Int
    var tutor: String = ""

    // this is another way to initialize the value
    init {
        this.id = _id
    }

    // secondary constructors can exist, but in Kotlin the better way for doing that is with default values
    // like we did in the LoggedUser class
    constructor(id: Int, firstName: String, lastName: String, tutor: String) : this(id, firstName, lastName) {
        this.tutor = tutor
    }

    override fun getAddress(): String = "dummy unloged user address"

}