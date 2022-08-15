package Kotlin.Arrays_and_Collections.Array_Copying





fun main(){
    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    val array2 = array1.copyOf()


    array2.forEach {
        println(it)
    }


}