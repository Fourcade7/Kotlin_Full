package Kotlin.Type_Check_and_Casts




fun main(){
    demo("xaxaxaxa")
    var y:String="axaxax"
    val x: String = y as String
}

fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}