package one.digitalinnovation.dioBank.teste

import one.digitalinnovation.dioBank.Gerente

fun main() {
    val bruno = Gerente("brunao", "12345678901", 30000.0)
    ImprimeRelatorio.relatorio(bruno)
}
