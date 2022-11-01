package Kotlin.Arrays_and_Collections.Arrays.Arrays_two_dimensional_array


fun main() {
    val even: IntArray = intArrayOf(2, 4, 6)
    val odd: IntArray = intArrayOf(1, 3, 5)

    val lala: Array<IntArray> = arrayOf(even, odd)
    println(lala[0][2])

    val arr: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6, 7),
        intArrayOf(8, 9)
    )

    for (row in arr)
    {
        if (row != null)
        {
            for (col in row) {
                print("$col ")
            }
        }
        println()
    }

    println(arr.contentDeepToString())        // [[1, 2, 3], [4, 5, 6, 7], [8, 9]]




}