package Kotlin.Exceptions.Try_Catch


fun main(){


    try {
        val a:Int?=null

        println(a!!/2)
    }catch (e:ArithmeticException){
        println(e.message)
    }catch (e:NullPointerException){
        println(e.message)
    }finally {
        println("ana kuyding")

    }

    validate(15)





}


fun validate(age: Int) {
    if (age < 18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
}