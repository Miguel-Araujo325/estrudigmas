package org.example

class Dvd(
    codigo: Int,
    precoCusto: Double,
    var nome: String,
    var gravadora: String
) : Produto(
    codigo, precoCusto
) {
    override fun getValorVenda(): Double {
        return precoCusto * 1.20
    }

    override fun toString(): String {
        return "\n" +
                """
                DVD $nome
                Gravadora: $gravadora
                Preço de venda: ${getValorVenda()}
                """.trimIndent()
    }
}
/*
Criar a classe DVD, herdeira de Produto, e que terá os atributos:
String nome /* nome do dvd */
String gravadora /* nome da gravadora */
Deve ter o construtor primário.
E deve implementar o método getValorVenda( ), que calcula o preço de venda como
sendo o preço de custo do DVD mais 20%. Deve ter também o método toString().
 */