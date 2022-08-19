package Kotlin.Classes.Getter_and_Setter



fun main(){
    val google=Google()
    google.nickname="Fourcade"
    println(google.nickname)
}


class Google{
    var nickname="Aminov"
    set(value) {
        println(field)
        field=value
        println(value)
    }
    get() {
    return field
    }
}

