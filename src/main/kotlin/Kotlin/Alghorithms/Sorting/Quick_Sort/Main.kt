package Kotlin.Alghorithms.Sorting







// Time Complexity from O(n log(n)) to O(n^2)
// Space Complexity O(log(n))

fun doSort(items: Array<Int>, fst: Int, lst: Int) {
    if (fst >= lst)
        return
    var i = fst
    var j = lst
    var x = items[(fst + lst)/2]

    while (i < j) {
        while (items[i] < x) i++
        while (items[j] > x) j--
        if (i <= j) {
            var tmp = items[i]
            items[i] = items[j]
            items[j] = tmp
            i++
            j--
        }
    }
    doSort(items, fst, j)
    doSort(items, i, lst)
}

fun sort(arr: Array<Int>): Array<Int>
{
    var items = arr.copyOf()
    doSort(items, 0, items.size - 1)
    return items
}

var items = arrayOf(4, 1, 5, 3, 2)

val sortItems = sort(items)
// sortItems is {1, 2, 3, 4, 5}
fun main(){
    sortItems.forEach {
        print("$it ") }

}

