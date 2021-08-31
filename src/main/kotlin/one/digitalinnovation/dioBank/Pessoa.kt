package one.digitalinnovation.dioBank

class Pessoa {
    var nome: String = "Brunao"
    var cpf: String = "123.123.123-12"
    private set
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
}