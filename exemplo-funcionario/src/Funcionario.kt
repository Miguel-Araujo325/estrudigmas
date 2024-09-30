open abstract class Funcionario(
    var cpf: String,
    var nome: String
) {
    abstract fun calcSalario(): Double

    override fun toString(): String {
        return """Funcionario: Nome: $nome, Cpf: $cpf""".trimIndent()
    }
}