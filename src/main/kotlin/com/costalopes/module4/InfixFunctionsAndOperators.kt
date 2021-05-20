package com.costalopes.module4

fun main(args: Array<String>) {

    val h1 = Header("H1")
    val h2 = Header("H2")

    // using as extension function only
    val h3 = h1.plus(h2)
    println(h3.name)

    // using as an Infix function
    val h4 = h1 plus h2
    println(h4.name)

    // using as an operator
    val h5 = h1 + h2
    println(h5.name)

}

class Header(var name: String) { }

infix operator fun Header.plus(other: Header): Header {
    return Header("${this.name} ${other.name}")
}