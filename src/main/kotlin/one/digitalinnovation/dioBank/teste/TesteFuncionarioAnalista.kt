package one.digitalinnovation.dioBank.teste

import one.digitalinnovation.dioBank.Analista
import one.digitalinnovation.dioBank.Funcionario
import java.math.BigDecimal

fun main() {
    val bruno = Analista("brunin", "12345678901", 20000.0)
    ImprimeRelatorio.relatorio(bruno)
}
