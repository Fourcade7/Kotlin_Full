package Kotlin.Work_with_File

import java.io.File
import java.io.FileWriter


fun main(){
    val file=File("test.txt")
    println(file.createNewFile())
    println(file.exists())
    file.writeText("how to make")
    file.appendText("kak tak vozmojno \neasy")
    file.forEachLine {
        println(it)
    }
    println(file.readText())
    println(file.readLines())

    val fw=FileWriter("file.txt")
    fw.write("axaxax")
    fw.close()

}