package org.example

class Livro(
    codigo: Int,
    precoCusto: Double,
    var nome: String,
    var autor: String,
    var isbn: String
) : Produto(
    codigo, precoCusto
) {
    override fun getValorVenda(): Double {
        return precoCusto * 1.10
    }

    override fun toString(): String {
        return "\n" + """
            Livro $nome
            Autor: $autor
            ISBN: $isbn
            Preço de venda: ${getValorVenda()}
        """.trimIndent()
    }

}
/*
Criar a classe Livro, herdeira de Produto, e que terá os atributos:
String nome /* nome do livro */
String autor /* autor do livro */
String isbn /* isbn do livro */
Deve ter o construtor primário.
E deve implementar o método getValorVenda( ), que calcula o preço de venda como
sendo o preço de custo do livro mais 10%. Deve ter também o método toString().
 */