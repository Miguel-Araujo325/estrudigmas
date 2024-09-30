package org.example

class Exercicio6 : IMain{
    override fun main() {
        var carros = Array(5){""}
        var rendimento = Array(5){0.0}

        for (i in carros.indices) {
            println("Digite o nome do carro")
            carros[i] = readln()
            println("Digite o rendimento do carro")
            rendimento[i] = readln().toDouble()
        }

        var menor = rendimento[0]
        var pos = 0
        for (i in rendimento.indices) {
            if (rendimento[i] > menor) {
                menor = rendimento[i]
                pos = i
            }
        }
        println("O carro mais econômico é o ${carros[pos]}")
    }
}
// Elaborar um programa que solicita que o usuário digite os nomes de 5 modelos de carros (exemplo: Gol, Vectra, HB20, etc), que deverão ser armazenados em um vetor. Depois, o usuário deverá digitar o rendimento desses carros, ou seja, quantos quilômetros cada um deles faz com um litro de combustível. O rendimento de cada modelo deverá ser armazenado em outro vetor. O programa deverá exibir qual o modelo de carro mais econômico.