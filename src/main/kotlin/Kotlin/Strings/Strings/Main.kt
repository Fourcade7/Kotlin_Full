package Kotlin.Strings

import Kotlin.Functions.Inline_Function.pr


fun main(){
    var name="aminov | Fourcade | Uzbekistan | Beruniy"
    var str="She said \"This is\" to me"
    val a="42"
    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    println(name.lowercase())
    println(name.uppercase())
    println(name.replaceFirstChar { it.uppercase() })
    println(a.toInt())
    println(a.toIntOrNull())
    println(name.replace("U","O`"))
    println(str)
    println(name.get(3))
    println(name[4])
    println(name.substring(4,7))
    println(name.substring(4..7))
    println(name.drop(2))
    println(name.dropLast(2))
    println(name.removeRange(4,7))
    println(name.removePrefix("amin"))
    println(name.subSequence(4,7))
    println(name.trimStart())
    println(name.trimEnd())
    println(name.trim())
    println(name.split("|"))//string to array words
    println(a.repeat(3))
    println(array1.joinToString(";"))
    println(name.indexOf("F"))
    println(name.contains("F"))

    stringtoprint(a)
    println(reverseword("Fourcade"))

}

fun reverseword(word:String):String{
    val count=word.length
    var result=""
    for (i in count-1 downTo 0){
        result=result+word[i]
    }

    return result
}

fun stringtoprint(name:String){
    for (i in name){
        println(i)
    }

    for ((i,j) in name.withIndex()){
        println("$i->$j")
    }
}