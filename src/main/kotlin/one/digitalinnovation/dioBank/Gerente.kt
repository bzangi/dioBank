package one.digitalinnovation.dioBank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculoBonus(): Double = salario * 0.4

    override fun login(): Boolean = "qwerty" == senha
}