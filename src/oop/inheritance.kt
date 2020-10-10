package oop

open class Person2() {
    open fun displayAge(age: Int) {
        println("My actual age is $age")
    }
}

class Boy : Person2() {
    override fun displayAge(age: Int) {
        super.displayAge(age)
        println("My fake age is ${age - 5}")
    }
}

fun main(args: Array<String>){
    val boy = Boy()
    boy.displayAge(8)
}