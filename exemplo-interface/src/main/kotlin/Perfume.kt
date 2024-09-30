package org.example

class Perfume(
    codigo: Int,
    descricao: String,
    preco: Double,
    var fragancia: String
) : Produto(
    codigo, descricao, preco
) {
    override fun getValorTributo(): Double {
        return preco * 1.27
    }

    override fun toString(): String {
        return super.toString() + "\nFragrância: $fragancia"
    }
}
/*
Criar a classe Perfume, herdeira de Produto
String fragrancia /* fragrância do perfume */
Deve ter o construtor primário.
E deve implementar o método getValorTributo( ), que calcula o imposto de ICMS sobre o
perfume, que é 27% do preço do perfume.
 */