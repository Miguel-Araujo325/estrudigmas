package org.example

class Secretaria(
    private var quantidadeHorasTrabalhadas: Double,
    private var quantidadeHorasExtraTrabalhada: Double,
    cpf: String,
    nome: String,
    valorHora: Double
) : Funcionario(
    cpf, nome, valorHora
) {

    fun getValorExtra(): Double {
        return quantidadeHorasExtraTrabalhada * getValorHora()
    }

    override fun calcularSalario(): Double {
        return (quantidadeHorasTrabalhadas * getValorHora()) + getValorExtra()
    }

    override fun toString(): String {
        return super.toString() + "\n Horas Trabalhadas: $quantidadeHorasTrabalhadas \n Horas Extras Trabalhadas: $quantidadeHorasExtraTrabalhada"
    }
}