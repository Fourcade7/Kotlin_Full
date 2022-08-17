package Kotlin.Arrays_and_Collections.Arrays.Arrays_Every_Some





fun main(){

    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    val work1=array1.filter { i -> i<10 }

    work1.forEach {
        println(it)
    }
}