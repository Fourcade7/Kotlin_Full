package Kotlin.Alghorithms.Sorting.Bubble_Sort

import java.util.Arrays


fun main(){
        val myarray= arrayOf(5,0,3,45,8,4,1,77,25)
        bubbleSort(myarray).forEach {
            println(it)
        }

}

fun bubbleSort(array:Array<Int>):Array<Int>{

    for (i in 0..array.size-1){
        for (j in i+1..array.size-1){
            if (array[i]>array[j]){
                var tmp=array[i]
                array[i]=array[j]
                array[j]=tmp
            }
        }
    }
    return array
}