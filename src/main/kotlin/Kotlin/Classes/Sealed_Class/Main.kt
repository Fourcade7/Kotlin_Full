package Kotlin.Classes.Sealed_Class



sealed class LoadState{
    data class Succes constructor(val data:String):LoadState()
    data class Failure constructor(val error:String):LoadState()
}

fun getLoad(loadState: LoadState):Any{

    val any=when(loadState){
        is LoadState.Succes->{
            loadState.data
        }
        is LoadState.Failure->{
            loadState.error
        }
    }
    return any
}


fun main(){
    println(getLoad(LoadState.Failure("500 ERROR")))
}
