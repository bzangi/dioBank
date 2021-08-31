package one.digitalinnovation.dioBank

data class Banco(
    val nome: String,
    val numeroBanco: Int
){
    fun info() = "$nome - $numeroBanco"
}
