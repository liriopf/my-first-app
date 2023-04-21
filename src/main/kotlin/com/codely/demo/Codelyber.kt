package com.codely.demo
import java.time.LocalDate
import java.time.Period

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

fun dateNotNullOrEmpty(readLine: String?) {
    readLine.takeUnless {
        it.isNullOrEmpty() || it.isNullOrBlank()
    }?.let { line ->
        val input = LocalDate.parse(line).also {
            println("You wrote $it")
        }
        with(Period.between(input, LocalDate.now())) {
            println("The difference between date your wrote and today is ${this.years}")
        }
    }
}

fun main() {
    println("Indroduce una fecha con formato <yyyy-MM-dd>")
    val readLine: String? = readLine()

    dateNotNullOrEmpty(readLine)

    dateDefaultWhenNull(readLine)
    dateIgnoreWhenNull(readLine)
    dateNeverNull(readLine)

    dateDefaultWhenNull(null)
    dateIgnoreWhenNull(null)
    dateNeverNull(null)
}
