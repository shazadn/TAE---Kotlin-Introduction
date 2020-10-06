package helloWorld

import java.util.*

fun main(args: Array<String>) {
    print("Enter text: ")

    val stringInput = readLine()!!
    println("You entered: $stringInput")

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer: Int = reader.nextInt()

    println("You entered: $integer")
}