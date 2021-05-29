package com.costalopes.module6

/**
 * Methods inside a copanion object are static methods on Kotlin world!
 */

fun main() {
    // using the methods on companion object to create instances
    val postgraduateStudent = StudentM6.createPostgraduate("John")
    val undergraduateStudent = StudentM6.createUndergraduate("Andrew")

    println(postgraduateStudent)
    print(undergraduateStudent)
}

class Program {
    // for the method of a companion object to be seen by JAVA code as static, we need the annotation @JvmStatic
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val postgraduateStudent = StudentM6.createPostgraduate("John")
            println(postgraduateStudent)
        }
    }
}

open class StudentM6(firstName: String, lastName: String, val id: Int, var tutor: String = "") : PersonM6(firstName, lastName) {

    /*
    Companion objects are like factories, they let me add factories methods to a class. They can also implement
    interfaces or extend classes. Remember that at the end they are classes, but with only one instance
     */
    companion object : XmlSerializer<StudentM6> {
        fun createUndergraduate(name: String): Undergraduate {
            return Undergraduate(name)
        }
        fun createPostgraduate(name: String): Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(item: StudentM6) {

        }
    }

}

class Undergraduate(firstName: String) : StudentM6(firstName, "", 1) { }

class Postgraduate(firstName: String) : StudentM6(firstName, "", 1) { }

abstract class PersonM6(val firstName: String, val lastName: String) {
    fun getName(): String = "$firstName $lastName"
}

interface XmlSerializer<T> {
    fun toXml(item: T)
}