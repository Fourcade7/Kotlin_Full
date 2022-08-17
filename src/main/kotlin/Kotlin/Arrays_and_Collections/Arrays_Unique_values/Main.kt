package Kotlin.Arrays_and_Collections.Arrays_Unique_values




fun main(){

    val array1 = arrayOf(2, 2, 6, 8, 10, 12, 14, 16, 18, 20)
    val array2=array1.distinct()

    array2.forEach {
        println(it)
    }
}