package org.example

class Exercicio5 : IMain {
    override fun main() {
        var dias = arrayOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado")

        var dia = 0

        do {
            println("Digite um número entre 1 e 7")
            dia = readln().toInt()
        } while (dia !in 1..7)
        println("Dia da semana: ${dias[dia - 1]}")

    }
}

// Elaborar um programa que contém um vetor de Strings, inicializado com os nomes dos dias da semana: "Domingo", "Segunda", "Terça", etc. ´
// Solicite que o usuário digite um número entre 1 a 7.
// Enquanto o usuário não digitar um valor nesse intervalo, solicite que o usuário digite novamente.
// Quando o usuário digitar um valor válido, exiba qual é o dia da semana correspondente, sendo que 1 é Domingo, 2 é Segunda, etc.