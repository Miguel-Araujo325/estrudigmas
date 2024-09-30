package org.example

class Exercicio2 :IMain{
    override fun main() {
        var array = Array(10) { 0 }
        for (i in array.indices) {
            println("\nDigite um valor")
            array[i] = readln().toInt()
        }

        var soma = 0
        for (i in array.indices) {
            soma += array[i]
        }

        var media = soma / array.size
        println("Média: $media")

        println("Números acima da média")
        for (i in array.indices) {
            if (array[i] > media) {
                print("${array[i]}, ")
            }
        }
    }
}
//2.  Escreva um programa que cria um vetor para armazenar 10 inteiros. O programa deve solicitar que o usuário digite 10 números, que devem ser armazenados nesse vetor.
//O programa deverá calcular a média dos números digitados e exibir a média.
//Depois, deverá exibir os números que estão no vetor que estão acima da média.