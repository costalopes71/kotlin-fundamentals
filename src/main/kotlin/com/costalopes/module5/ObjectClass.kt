package com.costalopes.module5

/*
An object is a singleton. When we define a class as an object Kotlin will already instantiate it.
 */
object Courses {
    var allCourses = arrayListOf<Course>()

    fun initializeCourses() {
        allCourses.add(Course(1,"Kotlin Fundamentals"))
    }

}

class Course(val id: Int, val title: String) {

}