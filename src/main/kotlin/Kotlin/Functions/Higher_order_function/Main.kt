package Kotlin.Functions.Higher_order_function






fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {
    val result = fn(org,portal)
    println(result)
}

fun main(){
//    val fn:(String,String)->String={org,portal->"$org develop $portal"}
//
//    myFun("pr.org","fourcade.com",fn)
    val req=object :Callback{
        override fun onSucces(result: String) {
            TODO("Not yet implemented")
        }

        override fun onFailure(error: String) {
            TODO("Not yet implemented")
        }
    }

    val req2=Retrofit({

    })


}


class Retrofit constructor(val result:(String)->Unit):Callback{
    override fun onSucces(result: String) {
        result(result)
    }

    override fun onFailure(error: String) {
        TODO("Not yet implemented")
    }


}

interface Callback{

    fun onSucces(result:String)
    fun onFailure(error:String)
}