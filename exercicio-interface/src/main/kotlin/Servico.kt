package org.example

class Servico(
    var codigo: Int,
    var descricao: String,
    var quantHoras: Int,
    var valorHora: Double
) : Vendavel {
    override fun getValorVenda(): Double {
        return quantHoras * valorHora
    }

    override fun toString(): String {
        return """
            Serviço
            Código: $codigo
            $descricao,
            Quantidade de Horas: $quantHoras,
            Valor Hora: $valorHora
            Valor de Venda: ${getValorVenda()}
        """.trimIndent()
    }
}

/*
Criar a classe Servico, que implementa a interface Vendavel, que terá os atributos:
String descricao /* descrição do serviço */
int codigo /* código do serviço */
int quantHoras /* quantidade de horas do serviço */
double valorHora /* valor da hora do serviço */
Deve ter o construtor primário.
E deve implementar o método getValorVenda( ), que calcula o preço de venda do
serviço, multiplicando a quantidade de horas pelo valor da hora do serviço.
Deve ter o método toString( ) que devolve uma String contendo os dados do serviço,
incluindo seu valor de venda
 */