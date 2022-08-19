package Kotlin.Functions.Inline_Function









fun main(){

        pr(7,{
            it*2
        })

}

inline fun pr(age:Int,data:(Int)->Int){
    println(data(age))
}

