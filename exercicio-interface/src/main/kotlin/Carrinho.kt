package org.example

class Carrinho {
    val cart: MutableList<Vendavel> = mutableListOf()

    fun adicionaVendavel(v: Vendavel){
        cart.add(v)
    }

    fun calculaTotalVenda(): Double{
        return cart.sumOf { item -> item.getValorVenda() }
    }

    fun exibeItensCarrinho(){
        cart.forEach { item ->
            println(item.toString())
        }
    }
}
/*
Criar a classe Carrinho, que tem como atributos:
List<Vendavel> cart; /* MutableList de itens vendáveis */
A classe Carrinho deve ter os métodos:
adicionaVendavel(Vendavel v) /* adiciona um item vendável em cart */
double calculaTotalVenda( ) /* calcula e retorna o total da venda dos itens de cart */
exibeItensCarrinho( ) /* exibe informações dos itens do carrinho */
 */