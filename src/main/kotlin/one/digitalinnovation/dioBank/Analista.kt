package one.digitalinnovation.dioBank

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {
    override fun calculoBonus(): Double = salario * 0.1

}