package Kotlin.Arrays_and_Collections.Arrays.Arrays_Sorting





fun main(){

    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    array1.sort()
    array1.sortDescending()


    array1.forEachIndexed { index, i ->
        println(i)
    }
}