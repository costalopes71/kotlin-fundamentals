package com.costalopes.module5

fun main() {
    val person1 = FamilyPerson(1, "Andre")
    val person2 = FamilyPerson(1, "Andre")

    println(person1)

    if (person1 == person2) {
        println("Equals")
    } else {
        println("Not equals")
    }

    val newPerson1 = person1.copy(name = "Joao")
    println(newPerson1)

}

/*
Data classes provide us the implementations of hashcode, equals, copy and toString methods by default
 */
data class FamilyPerson(val id: Int, val name: String) {

}