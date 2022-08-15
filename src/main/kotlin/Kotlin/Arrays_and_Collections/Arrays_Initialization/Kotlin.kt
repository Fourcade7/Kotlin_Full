package Kotlin.Arrays_and_Collections.Arrays_Initialization


fun main() {
    //Empty array
    val n1 = IntArray(0)
    val n2 = intArrayOf()

// Single-dimensional array
    val n3 = arrayOf(1, 2, 3)
    val n4 = intArrayOf(1, 2, 3)
    val n5: IntArray = intArrayOf(1, 2, 3)
    val s1 = arrayOf("1", "2", "3")

// Multidimensional array.
    val n6 = Array(2, { Array(2, { 0 }) })
    val n7: Array<Array<Int>> = Array(2, { Array(3, { 0 }) })
    n7[1][2] = 7

// Jagged array
    val n8 = Array(2, { Array(2, { 0 }) })
    n8[1] = Array(3, { 0 })
    n8[1][2] = 7
}