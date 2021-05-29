package com.costalopes.module5

/*
An object is a singleton. When we define a class as an object Kotlin will already instantiate it.
 */
object Courses {
    var allCourses = arrayListOf<Course>()

    fun initializeCourses() {
        allCourses.add(Course(1,"Kotlin Fundamentals"))
    }

    /*
    Objects are classes, so they can be used anywhere where classes can, and they also can implement interfaces
    and extend classes. They can also be nested within a class
    */
    object CoursesComparator : Comparator<Course> {
        override fun compare(course1: Course?, course2: Course?): Int {
            return course1!!.title.compareTo(course2!!.title)
        }
    }

}

class Course(val id: Int, val title: String) {

}