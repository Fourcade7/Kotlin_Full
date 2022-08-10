package Kotlin.Alghorithms.Search.Binary_Search


fun main() {
    val array = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    print(binarySearch(array, 8))

    val items = Array(10, { 20 })
    items.forEach {
        println(it)
    }


}

fun binarySearch(array: Array<Int>, x: Int): Int {
    var i = 0
    var j = array.size
    while (i != j) {
        var m = (i + j) / 2
        if (x == array.get(m)) {
            return m
        }
        if (x < array.get(m)) {
            j = m
        } else {
            i = m + 1
        }
    }
    return 0
}