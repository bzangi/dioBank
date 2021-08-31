package one.digitalinnovation.dioBank.teste

import one.digitalinnovation.dioBank.Banco

class BancoTeste {
}
fun main() {
    val dioBank = Banco("dioBank", 12)

    println(dioBank.nome)
    println(dioBank.numeroBanco)

    val bancoAleatorio = dioBank.copy(nome = "banco random")

    println(bancoAleatorio.info())
}