package org.example

abstract class Produto(
    var codigo: Int,
    var precoCusto: Double,
) : Vendavel{
    override fun toString(): String {
        return """
            Produto
            Código: $codigo
            Preço Custo: $precoCusto
        """.trimIndent()
    }
}

/*
Criar a classe abstrata Produto que implementa a interface Vendavel, e que terá como
atributos:
Int codigo /* código do produto */
Double precoCusto /* preço de custo do produto */
Deve ter o construtor primário, e o método toString(). O toString() deve retornar
também o preço de venda do produto.
 */