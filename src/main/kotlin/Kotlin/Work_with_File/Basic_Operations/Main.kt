package Kotlin.Work_with_File.Basic_Operations

import java.io.File


fun main(){
    val dir= File("Fourcade")
    val dir2= File("Fourcade2")
    dir.mkdirs()
    dir.copyRecursively(dir2,true)
    //dir2.deleteRecursively() delete with files
    dir2.delete()
}