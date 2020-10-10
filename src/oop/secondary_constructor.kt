package oop

open class Log {
    var data: String = ""
    var numberOfData = 50

    constructor(_data: String){
        data = _data
        println("$data: $numberOfData times")
    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }

}

class AuthLog: Log{
    constructor(_data: String): this("From AuthLog -> " + _data, 10){}
    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData){}
}

fun main(args:Array<String>){
    val p1 = AuthLog("Bad Password")
    val p2 = AuthLog("Shazad")
    val p3 = Log("James")
    val p4 = Log("Random")
    val p5 = Log("Random2", 8)
}