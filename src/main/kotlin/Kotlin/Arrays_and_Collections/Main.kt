package Kotlin.Arrays_and_Collections

fun fastlinearSearch(list: MutableList<Int>, x: Int): Int {
    var i = 0
    var count = list.size
    list.add(x)
    while (true) {
        if (list[i] == x) {
            if (i < count) {
                return i
            } else {
                println("number is not found")
                return 0
            }
        }
        i++
    }


}