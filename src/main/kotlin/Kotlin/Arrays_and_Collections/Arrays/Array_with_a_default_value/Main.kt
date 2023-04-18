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
    /*
     val array:Array<Int> =Array(10,{4})
    array.forEach {
        println(it)
    }
    println("array2")
    val array2=IntArray(10)
    array2.forEach {
        println(it)
    }
    println("array3")
    val array3=IntArray(10,{
        it
    })
    array3.forEach {
        println(it)
    }

    println("array4")
    val array4=IntArray(10){it*2}
    array4.forEach {
        println(it)
    }
    println("array5")
    val array5= arrayOfNulls<Int>(100)
    array5.forEach {
        println(it)
    }
    * */
}