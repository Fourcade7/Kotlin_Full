package Kotlin.Arrays_and_Collections.Array_with_a_default_value



fun main(){
    val array1=Array(10,{7})
    array1.forEach {
        println(it)
    }

    val array2=IntArray(10,{8})
    array2.forEach {
        println(it)
    }
}