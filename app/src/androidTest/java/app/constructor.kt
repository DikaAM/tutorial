package app

import data.Car

fun main(){
    val avanza = Car("Toyota", 2020)
    val almaz = Car("Wuling", 2021)
    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}