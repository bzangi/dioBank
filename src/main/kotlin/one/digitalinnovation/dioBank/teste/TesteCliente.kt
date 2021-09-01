package one.digitalinnovation.dioBank.teste

import one.digitalinnovation.dioBank.Cliente
import one.digitalinnovation.dioBank.ClienteTipo

fun main() {
    val bruno = Cliente(
        nome = "Bruno Zangi",
        cpf = "12345678901",
        clienteTipo = ClienteTipo.P_FIS,
        senha = "senhaTop"
    )

    println(bruno)

    TesteAutenticacao().autentica(bruno)
}
