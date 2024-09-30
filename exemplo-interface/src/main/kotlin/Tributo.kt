package org.example

class Tributo {
    val listaTrib: MutableList<Tributavel> = mutableListOf();

    fun adicionaTributavel(t: Tributavel){
        listaTrib.add(t)
    }

    fun calculaTotalTributo(): Double{
        return listaTrib.sumOf { tributo -> tributo.getValorTributo() }
    }

    fun exibeTodos(){
        listaTrib.forEach { tributavel -> println(tributavel.toString() + "\n") }
    }
}

/*
Criar a classe Tributo, que tem como atributos:
MutableList<Tributavel> listaTrib; /* lista mutável de itens tributáveis
A classe Tributo deve ter os métodos:
adicionaTributavel(Tributavel t) /* adiciona um item tributável na lista de
 tributáveis */
double calculaTotalTributo( ) /* calcula o total dos tributos dos itens
 armazenados */
void exibeTodos( ) /* exibe todos os itens armazenados na lista de tributáveis
 */