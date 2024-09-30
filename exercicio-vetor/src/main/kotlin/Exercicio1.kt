package org.example

class Exercicio1 : IMain {
    override fun main() {
        var array = Array(7) { 0 }
        for (i in array.indices) {
            println("Digite um valor")
            array[i] = readln().toInt()
        }

        println("Imprimindo indices")
        for (i in array.indices) {
            print("${array[i]}, ")
        }

        println("\nImprimindo indices ao contrario")
        for (i in array.indices.reversed()) {
            print("${array[i]}, ")
        }
    }
}
/*
1.  Escreva um programa que leia 7 números e armazene-os em um vetor. Depois, o programa deve percorrer o vetor exibindo os números na ordem em que foram inseridos. E depois, deve percorrer o vetor de trás para frente, exibindo os números na ordem inversa em que foram inseridos .
 */