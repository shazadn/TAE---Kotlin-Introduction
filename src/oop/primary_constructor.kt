package oop

class Person(_firstName: String, _age: Int){
    val firstName= _firstName.capitalize()
    var age= _age

    init {
        println("First name: $firstName")
        println("Age: $age\n")
    }
}

fun main(args: Array<String>){
    val person1 = Person("Shazad", 25)
    val person2 = Person("Joe", 18)
}