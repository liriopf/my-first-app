package com.codely.demo

import java.time.LocalDate

fun main() {
    println("Indroduce una fecha con formato <yyyy-MM-dd>")
//    val readLine: String? = readLine()
    val readLine: String? = null
    //val input = LocalDate.parse(readLine?:"1947-08-14") //Si llega null coge fecha por defecto
//    val input = LocalDate.parse(readLine!!) //!! se usa para indicar que ese valor nunca va a ser null
                                              //    , si llegase un null rompe en esta linea
    //    println("has escrito $input ${input.dayOfWeek}")

    readLine?.let {
        //Solo entra aqui cuando read line no es null
        val input = LocalDate.parse(readLine)
        println("has escrito $input ${input.dayOfWeek}")
    }




}
