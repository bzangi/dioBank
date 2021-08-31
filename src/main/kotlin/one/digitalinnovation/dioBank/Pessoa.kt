package one.digitalinnovation.dioBank

class Pessoa {
    var nome: String = "Brunao"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfos() = "nome $nome cpf $cpf"
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.pessoaInfos())
}