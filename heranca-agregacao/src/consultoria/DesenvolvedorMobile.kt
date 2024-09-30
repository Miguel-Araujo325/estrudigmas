package consultoria

class DesenvolvedorMobile(
    nome: String,
    valorHoraTrabalhada: Double,
    qtdHorasTrabalhadas: Int,
    var valorHoraTrabalhadaMobile: Double,
    var qtdHorasTrabalhadasMobile: Int
) : Desenvolvedor(nome,qtdHorasTrabalhadas, valorHoraTrabalhada) {

    override fun getSalario(): Double {
        return (qtdHorasTrabalhadasMobile + qtdHorasTrabalhadas)  * (valorHoraTrabalhadaMobile + valorHoraTrabalhada)
    }

    override fun toString(): String {
        return """
        Nome: $nome
        Quantidade de Horas Trabalhadas: ${qtdHorasTrabalhadas}
        Valor da hora: R$${valorHoraTrabalhada}
        Quantidade de Horas Mobile: $qtdHorasTrabalhadasMobile
        Valor da hora mobile: $valorHoraTrabalhadaMobile
        Salario: ${getSalario()}
    """.trimIndent()
    }
}
