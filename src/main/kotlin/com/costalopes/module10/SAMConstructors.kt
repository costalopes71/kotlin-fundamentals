package com.costalopes.module10

import com.costalopes.module10.java.Created
import com.costalopes.module10.java.User

fun main() {

    var user = User("John")

    /* this is a SAM constructor, its useful when:
        - The compiler cannot explicitly convert lambda to a functional interface
        - when we want to return a lambda from a method call thats going to be used to make a call into the Java code
     */
    var eventListener = Created { println("User $it has been created") }

    user.create(eventListener)

}