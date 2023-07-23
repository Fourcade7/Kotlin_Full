package Kotlin.Functions.Lambdas

 fun pr(myfun:Unit){
     
 }

fun main() {
    
    val randomnumber=(0..10).random()

    val listener: ((Int) -> Unit) = {}
    pr(listener.invoke(8))
   


    val add: (Int) -> (Int) = {
        println("This is add")
        it * 2
    }



    val add2:(Int)->(Int)={pr:Int->
        println("this is add2")
        pr*2
    }

    val add3:(Int,Int)->(Int)={ it1:Int,it2:Int->

        it1+it2
    }

    val add4:(String,Int)->Unit={name:String,age:Int->
        println(name)
        println(age)
    }

    val add5={a:Int,b:Int-> a+b
        println(a+b)
    }




    println(add(5))
    println(add2(5))
    println(add3(5,2))
    add4("axaxax",7)
    add5(2,7)


}
