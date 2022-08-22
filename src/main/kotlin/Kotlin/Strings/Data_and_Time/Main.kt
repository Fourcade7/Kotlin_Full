package Kotlin.Strings.Data_and_Time

import java.time.LocalDateTime
import java.util.*


fun main(){
    val now= Date()
    val calendar=Calendar.getInstance()
    val today=calendar.get(Calendar.DAY_OF_MONTH)
    val moment=LocalDateTime.now()
    val tomorrow=moment.plusDays(1)
    val time=moment.hour
    println(now)
    println(today)
    println(moment)
    println(tomorrow)
    println(time)
}
