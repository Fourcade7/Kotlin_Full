package Kotlin.Arrays_and_Collections.Map.Add_and_Remove_element









fun main(){

    val map= mutableMapOf<Int,String>(1 to "one", 2 to "two", 3 to "three")
    val map2= mapOf(1 to "one", 2 to "Ttwo", 3 to "tHree")
    val map3=map+map2
    map[4]="four"
    //map.remove(3)
    print(map.get(4))
    print(map[4])
    println(map.count())
    //map.clear()

    map.mapValues {
        println(it)
    }
    map.mapKeys {

    }

    map.forEach { t, u -> 
        println("$t->${u.uppercase()}")
    }

    println(map.contains(2))
    println(map.containsKey(3))
    println("map to list")
    map3.toList().filter { (i )-> i>0
    }.toMap()

    map3.forEach {
        print(it)
    }

}