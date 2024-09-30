package produtora

open class Ator(
    var nome: String,
    var qtdHorasTrabalhadas: Int,
    var valorHoraTrabalhada: Double
) {
    open fun getSalario(): Double {
        return qtdHorasTrabalhadas * valorHoraTrabalhada
    }

    override fun toString(): String {
        return """
            Nome: $nome
            Quantidade de Horas Trabalhadas: $qtdHorasTrabalhadas
            Valor da hora: R${'$'}$valorHoraTrabalhada
            Salario: ${String.format("%.2f", getSalario())}
            """.trimIndent()
    }
}