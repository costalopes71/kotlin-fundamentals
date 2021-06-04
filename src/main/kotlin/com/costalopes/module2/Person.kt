package com.costalopes.module2

class Person (var Name: String) {

    fun display() {
        println("Display: $Name")
    }

    fun displayWithLambda(func: (s: String) -> Unit) {
        func(Name)
    }

}