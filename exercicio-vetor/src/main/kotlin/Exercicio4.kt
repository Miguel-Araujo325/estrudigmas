package org.example

class Exercicio4 : IMain {
    override fun main() {
        var array = Array(10){0}
        for (i in array.indices) {
            println("Digite um valor")
            array[i] = readln().toInt()
        }

        println("Digite um número para pesquisar")
        var numero = readln().toInt()

        var c = 0
        for (i in array.indices) {
            if (array[i] == numero) {
                c++
            }
        }
        println("O número $numero ocorre $c vezes")
    }
}// 4.  Elaborar um programa que solicita que o usuário digite 10 valores inteiros e armazene esses valores em um vetor. Depois o programa deve solicitar que o usuário digite um número qualquer e o programa deverá exibir quantas vezes esse número ocorre no vetor.
        //
        //Exemplo:  considere os números 3  7  9  3  7  1  3  3  5  8
        //o número 7 ocorre 2 vezes
        //o número 3 ocorre 4 vezes
        //o número 2 não ocorre nenhuma vez.
