package org.example

class Alimento(
    codigo: Int,
    descricao: String,
    preco: Double,
    var quantVitamina: Int
) : Produto(codigo, descricao, preco) {

    override fun getValorTributo(): Double {
        return preco * 1.15
    }

    override fun toString(): String {
        return super.toString() + "\nquantViramina: $quantVitamina"
    }
}
/*
Criar a classe Alimento, herdeira de Produto
Int quantVitamina /* quantidade de vitaminas */
Deve ter o construtor primário.
E deve implementar o método getValorTributo( ), que calcula o imposto de ICMS sobre o
alimento, que é 15% do preço do alimento.
 */