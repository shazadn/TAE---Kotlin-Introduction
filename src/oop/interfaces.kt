package oop

interface myInterface {
    val test: Int
    fun foo(): String
    fun message() {
        println("Hello there!")
    }
}
    interface myInterface2 {
        fun foo2(): String
    }

    class InterfaceImpl : myInterface, myInterface2 {
        override val test: Int
            get() = 5

        override fun foo(): String {
            return "foo"
        }

        override fun foo2() = "foo2"
    }

    fun main(args: Array <String>){
        val obj = InterfaceImpl()
        println("${obj.test}")
        println("${obj.foo()}")
        println("${obj.foo2()}")

    }

