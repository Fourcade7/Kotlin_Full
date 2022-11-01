package Kotlin.Arrays_and_Collections.Arrays.Array_Filter_elements




fun main(){


    val array1 = arrayOf(2, 4, 6, 8, -10, 17, 14, 16, 18, 20)
    val array2=array1.filter { i -> i>0 }
    val array3=array1.filter { i -> i%2==1 }
    val intarray= IntArray(10){i -> i}
    intarray.forEach {
        println(it)
    }

    array2.forEach {
        println(it)
    }
}