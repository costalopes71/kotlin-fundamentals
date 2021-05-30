package com.costalopes.module7

import java.util.*

fun main() {
    var meeting = Meeting()
    meeting.title = "Board Meeting"
    meeting.date = Date(2020,1,1)
    meeting.who.add("Kevin")

    // we can initialize those fields much easier using with
    with(meeting) {
        title = "Board Meeting"
        date = Date(2021, 1, 1)
        who.add("John")
    }

    // apply is very similiar to with, but it returns the receiver
    meeting.apply {
        title = "Board Meeting"
        date = Date(2021,1,1)
        who.add("Carlos")
    }.create() // because it returns the receiver I can call methods on it

}

class Meeting {
    var title: String = ""
    var date: Date = Date()
    var who = mutableListOf<String>()

    fun create() = "Creating meeting"
}
