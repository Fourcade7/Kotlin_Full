package Kotlin.Arrays_and_Collections.Map.Map_Sort






fun main(){
    val map1= mapOf(4 to "four" ,1 to "one", 2 to "Ttwo", 3 to "three")
    val map2=map1.toList().sortedBy { (key,_)-> key  }.toMap()
    val map3=map1.toList().sortedBy { (key,v)-> v  }.toMap()

    map2.forEach { t, u ->
        println("$t->$u")
    }


    map3.forEach { t, u ->
        println("$t->$u")
    }
    val map4=map1.toSortedMap()

    map4.forEach { t, u ->
        println("$t->$u")
    }

}