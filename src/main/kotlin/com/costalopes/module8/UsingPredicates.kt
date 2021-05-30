package com.costalopes.module8

fun main() {

    val ints = listOf(1,2,3,4,5)

    var isAnyIntGreaterThan = ints.any { it > 3 }
    var isAllIntsGreaterThan = ints.all { it > 3 }
    var totalIntsGreaterThan = ints.count { it > 3 }

    println("Any int greater than 3: $isAnyIntGreaterThan")
    println("All ints greater than 3: $isAllIntsGreaterThan")
    println("Total of ints greated than 3: $totalIntsGreaterThan")

    // or we can instantiate a predicate and call the methods on the collection using the Predicate object
    val greaterThanThree = { number:Int -> number > 3 }

    isAnyIntGreaterThan = ints.any(greaterThanThree)
    isAllIntsGreaterThan = ints.all(greaterThanThree)
    totalIntsGreaterThan = ints.count(greaterThanThree)

    // the find predicate returns the first element that matches the predicate or null with none
    var found: Int? = ints.find(greaterThanThree);
    println("Found: $found")

    found = ints.find { it > 6 }
    println("Found: $found")

}