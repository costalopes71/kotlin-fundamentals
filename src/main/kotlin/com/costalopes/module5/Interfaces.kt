package com.costalopes.module5

interface Time {
    fun setTime(hours:Int, mins: Int = 0, secs: Int = 0)
    // interfaces can have default methods
    fun setTime(time: KevinTime) = setTime(time.hours)
}

interface EndOfWorldTime {
    // default method
    fun setTime(time: KevinTime) { }
}

// use : instead of the implements key word
class YetiTime : Time, EndOfWorldTime {
    // override key word is mandatory
    override fun setTime(hours: Int, mins: Int, secs: Int) { }
    // when implementing multiple interfaces that have default methods with same name, we must override it
    override fun setTime(time: KevinTime) {
        // on the method implemantation i can call the interfaces implemantion, one or both
        super<Time>.setTime(time)
        super<EndOfWorldTime>.setTime(time)
    }

}

class KevinTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}
