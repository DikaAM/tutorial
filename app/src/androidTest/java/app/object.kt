package app

import data.Person

fun main() {
    val jancuk = Person()
    jancuk.firstName = "Jancuk Kabeh"

    val asu = Person()
    asu.firstName = "Suae"

    val saasa = Person()
    saasa.middleName = "Jancuk"

    println(jancuk.firstName)
    println(asu.firstName)
    println(saasa.middleName)
}