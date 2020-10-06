package intro_and_flowControl

fun main(args: Array<String>) {

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 6 downTo 1) print(i)

    println()

    print("for (i in 1..4 step 2) print(i) = ")
    for (i in 1..7 step 3) print(i)

    println()

    print("for (i in 4 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 3) print(i)
}