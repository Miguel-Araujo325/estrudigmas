package org.example

abstract class Produto(
    var codigo: Int,
    var descricao: String,
    var preco: Double
    ) : Tributavel {
    override fun toString(): String {
    return """
        Produto
        Código: $codigo
        Descrição: $descricao
        Preço: $preco
    """.trimIndent()
    }
}
/*
Criar a classe abstrata Produto, que implementa a interface Tributavel e que terá como
atributos:
Int codigo /* código do produto */
String descrição /* descrição do produto */
Double preco /* preço do produto */
Deve ter o construtor primário
 */