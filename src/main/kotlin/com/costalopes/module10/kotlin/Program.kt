package com.costalopes.module10.kotlin

import com.costalopes.module10.java.User

fun main(): Unit {

    var user = User("John")

    // this Kotlin lambda is been turned into a Java anonymous object
    user.create { println("User: $it has been created") }
    // if I make this call again, the lambda created is been reused.
    user.create { println("User: $it has been created") }

    /* if this object that is been created by the Kotlin lambda capture state,
    then another instance is created, there is no reuse. Example: */
    var count = 0
    user.create { println("User: $it has been created ${++count} times") }
    user.create { println("User: $it has been created ${++count} times") }

}