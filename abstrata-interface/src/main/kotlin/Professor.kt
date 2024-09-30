package org.example

class Professor(
    private var quantidadeAulasPorSemana: Int,
    cpf: String,
    nome: String,
    valorHora: Double
) : Funcionario(
    cpf, nome, valorHora
), IBonus {
    fun getQuantidadeAulasPorSemana(): Int {
        return quantidadeAulasPorSemana
    }

    fun setQuantidadeAulasPorSemana(quantidadeAulasPorSemana: Int) {
        this.quantidadeAulasPorSemana = quantidadeAulasPorSemana
    }

    override fun calcularSalario(): Double {
        return (quantidadeAulasPorSemana * getValorHora() * 4.5)
    }

    override fun getBonus(): Double {
        return calcularSalario() * 0.15
    }

    override fun toString(): String {
        return super.toString() + "\n Quantidade de Aulas Por Semanaa: $quantidadeAulasPorSemana \n Bonus: ${getBonus()}"
    }
}