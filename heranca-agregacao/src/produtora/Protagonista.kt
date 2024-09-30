package produtora

class Protagonista(
    nome: String,
    qtdHorasTrabalhadas: Int,
    valorHoraTrabalhada: Double,
    var qtdHorasTrabalhadasProtagonista: Int,
    var valorHoraTrabalhasProtagonista: Double
) : Ator(nome, qtdHorasTrabalhadas, valorHoraTrabalhada){
    override fun getSalario(): Double {
        return  (qtdHorasTrabalhadas + qtdHorasTrabalhadasProtagonista) * (valorHoraTrabalhada + valorHoraTrabalhasProtagonista)
    }
    override fun toString(): String {
        return """
            Nome: $nome
            Quantidade de Horas Trabalhadas: $qtdHorasTrabalhadas
            Quantidade de Horas Trabalhadas Protagonisca: $qtdHorasTrabalhadasProtagonista
            Valor da hora: R${'$'}$valorHoraTrabalhada
            Valor da Hora Protagonista: R${'$'}$valorHoraTrabalhasProtagonista
            Salario: ${String.format("%.2f", getSalario())}
            """.trimIndent()
    }
}