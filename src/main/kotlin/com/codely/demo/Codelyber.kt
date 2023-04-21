package com.codely.demo
import java.time.LocalDate
fun dateDefaultWhenNull(readLine: String?) {
    val input = LocalDate.parse(readLine ?: "1947-08-14") // Si llega null coge fecha por defecto
    println("Fecha por defecto cuando es null $input ${input.dayOfWeek}")
}
fun dateIgnoreWhenNull(readLine: String?) {
    readLine.let {
         // Solo se procesa si no es null
        val input = LocalDate.parse(readLine)
        println("NO se ejecuta cuando es null $input ${input.dayOfWeek}")
    }
}
fun dateNeverNull(readLine: String?) {
    val input = LocalDate.parse(readLine!!) // No se espera null así que lanza nullPointer
    println("Lanza excepción cuando es null $input ${input.dayOfWeek}")
}
fun main() {
    println("Indroduce una fecha con formato <yyyy-MM-dd>")
    val readLine: String? = readLine()

    dateDefaultWhenNull(readLine)
    dateIgnoreWhenNull(readLine)
    dateNeverNull(readLine)

    dateDefaultWhenNull(null)
    dateIgnoreWhenNull(null)
    dateNeverNull(null)
}
