package Kotlin.Alghorithms.Search.Fast_linear_Search


fun main() {
    val mlist = mutableListOf<Int>(2, 4, 5, 6, 8)
    mlist.add(10)
    mlist.add(12)
    mlist.add(14)

    println(fastlinearSearch(mlist, 3))

}


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