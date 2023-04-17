package Kotlin.Arrays_and_Collections.Arrays.Array_with_a_default_value



fun main(){
    val array1=Array(10,{7})

    array1.forEach {
        println(it)
    }

    val array2=IntArray(10,{8})
    array2.forEach {
        println(it)
    }

    val array3=IntArray(10){2}
    array3.forEach {
        println(it)
    }
    val array4=IntArray(20){i -> i*1 }

    println(array3.joinToString())
    println(array4.joinToString())

    val array5= arrayOfNulls<Int>(100)
    array5.forEach {
        println(it)
    }
}