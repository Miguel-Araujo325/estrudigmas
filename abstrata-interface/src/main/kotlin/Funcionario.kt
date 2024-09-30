package org.example

abstract class Funcionario(
    protected var cpf: String,
    protected var nome: String,
    private var valorHora: Double
) {
    abstract fun calcularSalario(): Double

    override fun toString(): String {
        return "Nome: $nome \n CPF: $cpf \n Salário: ${calcularSalario()}"
    }

    fun getValorHora(): Double {
        return valorHora
    }

    fun setValorHora(valorHora: Double) {
        this.valorHora = valorHora
    }
}