package Kotlin.Arrays_and_Collections.Array_Filter_elements




fun main(){


    val array1 = arrayOf(2, 4, 6, 8, -10, 12, 14, 16, 18, 20)
    val array2=array1.filter { i -> i>0 }

    array2.forEach {
        println(it)
    }
}