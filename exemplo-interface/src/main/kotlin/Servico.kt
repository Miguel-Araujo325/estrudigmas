package org.example

class Servico(
    var descricao: String,
    var preco: Double,
) : Tributavel{
    override fun getValorTributo(): Double {
        return preco * 1.12
    }

    override fun toString(): String {
        return """
            Servico
            Descrição: $descricao
            Preço: $preco
        """.trimIndent()
    }
}
/*
Criar a classe Servico, que implementa a interface Tributavel
String descricao /* descrição do serviço */
Double preco /* preço do serviço */
Deve ter o construtor primário.
E deve implementar o método getValorTributo( ), que calcula o imposto de ISS sobre o
serviço, que é 12% do preço do serviço.
 */