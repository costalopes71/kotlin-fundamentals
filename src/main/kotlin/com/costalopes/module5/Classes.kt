package com.costalopes.module5

/* classes are final by default in Kotlin, in order to make them extendable
we need to prefix it with open keyword */
open class Person {
    private var firstName: String = ""
    private var lastName: String = ""

    /* methods are also final by default, and in order to override it we need
    to prefix it with the open keyword */
    open fun getName(): String = "$firstName $lastName"
}

class Student : Person() {
    override fun getName(): String { return "" }
}

/*
Abstract classes
 */

abstract class Animal {
    private var name: String = ""

    // abstract classes can have concrete methods (open and closed)
    open fun getName(): String = name
    // abstract classes can have abstract methods
    abstract fun makeSound(): String

}

class Dog : Animal() {

    override fun makeSound(): String {
        return "wof wof"
    }

    override fun getName(): String = "Dog"

}