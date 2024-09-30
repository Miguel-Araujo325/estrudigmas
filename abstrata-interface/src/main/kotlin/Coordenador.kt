package org.example

class Coordenador(
    private var quantidadeHorasCoordenacaoSemana: Double,
    private var quantidadeCursosCordenacao: Int,
    cpf: String,
    nome: String,
    valorHora: Double
) : Funcionario(
    cpf, nome, valorHora
), IBonus {
    fun getQuantidadeHorasCoordenacaoSemana(): Double {
        return quantidadeHorasCoordenacaoSemana
    }

    fun setQuantidadeHorasCoordenacaoSemana(quantidadeHorasCoordenacaoSemana: Double) {
        this.quantidadeHorasCoordenacaoSemana = quantidadeHorasCoordenacaoSemana
    }

    override fun calcularSalario(): Double {
        return (quantidadeHorasCoordenacaoSemana * getValorHora() * 4.5) + (quantidadeCursosCordenacao * 500)
    }

    override fun getBonus(): Double {
        return calcularSalario() * 0.20
    }

    override fun toString(): String {
        return super.toString() + "\n Quantidade de Horas de Coordenacao Por Semana: $quantidadeHorasCoordenacaoSemana \n Quantidade de Cursos de Coordenacao: $quantidadeCursosCordenacao \n Bonus: ${getBonus()}"
    }
}