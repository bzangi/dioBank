package one.digitalinnovation.dioBank.teste

import one.digitalinnovation.dioBank.ClienteTipo

fun main() {
//    ClienteTipo.values().forEach { elemento ->
//        println("${elemento.name} - ${elemento.descricao}")
//    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.P_FIS
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.P_JUR
    println("${pj.name} - ${pj.descricao}")
}