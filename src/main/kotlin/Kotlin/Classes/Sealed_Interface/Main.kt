package Kotlin.Classes.Sealed_Interface

import kotlin.Error


sealed class Error():Adobe{
    object UserError:Error()
    object ClientError:Error()
}

sealed interface Adobe



fun getError(adobe: Adobe):Any{
    val err=when(adobe){

        else -> {}
    }

    return err
}

fun main(){

}