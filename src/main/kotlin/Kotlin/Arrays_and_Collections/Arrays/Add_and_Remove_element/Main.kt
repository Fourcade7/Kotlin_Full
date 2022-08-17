package Kotlin.Arrays_and_Collections.Arrays.Add_and_Remove_element





fun main(){
        val list= mutableListOf(1,2,3,4,5,6,7)
        list.add(8)
        list.add(0,0)
        list.removeAt(3)
        list.removeAt(3)
        list.indexOf(3)//2
        list.addAll(listOf(10,20,30))
        list.addAll(8,listOf(100,200,300)) //8 dab boshlab qo`shadi
        list.removeAll(mutableListOf(10,20,30))

        list.forEachIndexed { index, i ->

            println("$index->$i")
        }






}