package com.costalopes.module9

import com.costalopes.module8.Meeting

fun main() {

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee meeting"))

    /* when using filter and map in very big data we can have a performance problem, because it uses a
        list under the hood and it does all the evaluations eagerly.
        So, when working with large data the best approach is to work with Sequences, because they are lazily
        evaluated
     */
    val titlesWithoutSequence: List<String> = meetings
        .filter { println("filter without sequence: $it"); it.title.endsWith("g") }
        .map { println("map without sequence: $it"); it.title }

    // pay attention on what will be printed to the console, when not using sequence the map and filter operations
    // are eager, when using sequence they are lazy
    for (title in titlesWithoutSequence) println(title)

    println("")

    val titlesUsingSequence: Sequence<String> = meetings.asSequence()
        .filter { println("filter using sequence: $it"); it.title.endsWith("g") }
        .map { println("map using sequence: $it"); it.title }

    for (title in titlesUsingSequence) println(title)

    /*
    Another example of the eager and lazy difference when using or not sequence:
     */
    println("\nFind terminal operation without sequence iterate over all items: ")

    val titleWithoutSequence = meetings.map { println("map without sequence: $it"); it.title.uppercase() }
        .find { it.startsWith("BOARD") }
    println("Find without sequence: $titleWithoutSequence")

    println("\nFind terminal operation using sequence will not iterate over all items if not necessary: ")

    val titleUsingSequence = meetings.asSequence()
        .map { println("map using sequence: $it"); it.title.uppercase() }
        .find { it.startsWith("BOARD") }
    println("Find using sequence: $titleUsingSequence")
}