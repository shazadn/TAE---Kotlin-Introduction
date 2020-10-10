package oop

class Lamp {
    //private var isOn= false
    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus() {
        if (isOn) {
            println("Light is switched on")
        } else println("Light is switched off")
    }
}

fun main(args: Array<String>){
    val lamp1 = Lamp()
    lamp1.displayLightStatus()

    val lamp2 = Lamp()
    lamp2.turnOn()
    lamp2.displayLightStatus()

}