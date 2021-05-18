package com.costalopes.module3

import java.util.*

fun main(args: Array<String>) {

    var continueLoop = false;

    // while is same as in Java
    while (continueLoop) {
        // do something
    }

    // do-while is same as in Java
    do {
        // do something
    } while (continueLoop)

    // for with range (inclusive range)
    for (i in 1..10) {
        println(i)
    }

    // steping
    for (i in 1..10 step 2) {
        println("Step: $i")
    }

    // going backwards
    for (i in 10 downTo 1) {
        println("Backwards $i")
    }

    // non inclusive for (half range)
    for (i in 1 until 10) {
        println("Until $i")
    }

    // iterating over collections (for each)
    val numbers = listOf(1, 2, 3, 4, 5);
    for (i in numbers) {
        println("Iterating over list element: $i")
    }

    // iterating over maps
    var ages = TreeMap<String, Int>()
    ages["Joao"] = 33
    ages["Nefs"] = 28
    ages["Yudi"] = 30
    ages["Lucas"] = 23
    ages["Qjo"] = 28
    for ((name, age) in ages) {
        println("Maps: $name is $age")
    }

    // for loops when index is needed
    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    // ranges can be used with any type that implements Comparable
    var charRange = 'a'..'z'

}