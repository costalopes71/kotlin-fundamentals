package com.costalopes.module8

fun main() {

    val ints = listOf(1,2,3,4,5)

    // using filter
    val smallInts = ints.filter { it < 4 }
    println("Using Filter:")
    for (number in smallInts) println(number)

    val squaredInts = ints.map { it*it }
    println("Using Map:")
    for (number in squaredInts) println(number)

    val smallSquaredInts = ints.filter { it < 5 }
        .map { it*it }
    println("Combining filter and map:")
    for (number in smallSquaredInts) println(number)

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles = meetings.filter { it.title.startsWith("C") }
        .map { it.title }

    println("Transforming to another object with map:")
    for (title in titles) println(title)

}

class Meeting(val id: Int, var title: String) {
    val people = listOf(Person("Sam"), Person("John"))
}

data class Person(val name: String) { }