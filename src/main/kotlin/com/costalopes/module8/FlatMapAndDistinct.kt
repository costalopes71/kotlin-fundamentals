package com.costalopes.module8

fun main() {

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    /*
        Flat map allow us to flaten a list. If we used a normal map here we would have a List<List<People>>
     */
    val people = meetings.flatMap { it.people }
        .distinct() // needs hashCode and equals methods on the object

    for (person in people) println(person.name)

}