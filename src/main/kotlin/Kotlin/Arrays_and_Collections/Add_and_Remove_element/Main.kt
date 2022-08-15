package Kotlin.Arrays_and_Collections.Add_and_Remove_element





fun main(){
        val array= mutableListOf(1,2,3,4,5,6,7)
        array.add(8)
        array.add(0,0)
        array.removeAt(3)
        array.addAll(listOf(10,20,30))
        array.addAll(0,listOf(100,200,300))




}