package helloWorld

fun main(args: Array<String>) {
//    //Iterating through array with an index
//    var language = arrayOf("Ruby", "Koltin", "Python", "Java")
//
//    for (item in language.indices) {
//
//        // printing array elements having even index only
//        if (item%2 == 0)
//            println(language[item])
//    }



        var text= "Kotlin"

        for (item in text.indices) {
            println(text[item])
        }
        println(text[3])

}