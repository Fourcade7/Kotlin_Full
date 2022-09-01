package Kotlin.Dependency_Injection.With_Servic_DI






fun main(){

    val iDep=Dep2()
    search(iDep)
}

fun search(iDep: IDep){
        println(iDep.a())
}