package functions

fun main(args: Array<String>) {
//   val addNumbers =  addNumbers(55.8, 14.0)
//    print("Result: $addNumbers")

    println(getName("Shazad", "Nasim"))
}


fun addNumbers(n1:Double, n2:Double): Int{
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun getName(firstName:String, lastName:String) = "$firstName $lastName"
