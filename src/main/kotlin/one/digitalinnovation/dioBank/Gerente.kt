package one.digitalinnovation.dioBank

class Gerente(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {
    override fun calculoBonus(): Double = salario * 0.4
}