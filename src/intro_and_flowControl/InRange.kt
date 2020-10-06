package intro_and_flowControl

fun main(args: Array<String>) {

    val a = 100
    //Within a specific range
    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }

    //Particular data type
//    when (x) {
//        is Int -> print(x + 1)
//        is String -> print(x.length + 1)
//        is IntArray -> print(x.sum())
//    }
}