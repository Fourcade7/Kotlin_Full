package Kotlin.Annonations




/*
val table = c.annotations.find { it is Table } as? Table
println(table?.name)
Note, I used the is operator since the annotation has RUNTIME retention and therefore it is an actual instance of the Table annotation within the collection. But the following works for any annotation:

val table = c.annotations.find { it.annotationClass == Table::class } as? Table
*/




fun main(){
    val fourcade=Fourcade()
    val ann=fourcade.javaClass.annotations.find { it is SourceData } as SourceData
    println(ann.author)
    println(ann.version)
}

@SourceData("Fourcade7",7,"My ANN")
class Fourcade{
    @SourceData("Laugh",8,"xD")
    fun printinfo(){
        println("Uaxaxxa")
        
    }
}


@Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class SourceData constructor(
    val author : String,
    val version : Int,
    val lastModified: String)


