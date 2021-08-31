package one.digitalinnovation.dioBank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numeroConta: String,
    var saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){

    }

    fun saque(valor: BigDecimal){

    }
}