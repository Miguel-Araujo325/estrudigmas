package org.example

fun main() {
    println("A - Números pares de 0 a 50")
    (0..50).filter { it % 2 == 0 }.forEach { println(it) }

    println("B - Números divisíveis por 3, multiplicados por 5")
    (0..50).filter { it % 3 == 0 }.map { it * 5 }.forEach { println(it) }

    println("C - Números de 0 a 10 menos os números (4, 7, 9)")
    (0..10).filter { it !in listOf(4, 7, 9) }.forEach { println(it) }

    println("D - Números de 1 a 10 multiplicados")
    (1..10).map { it * 2 }.forEach { println(it) }

    val numero = Numero(2.0)
    numero.operacao(4.0) { a, b -> a + b }
    numero.operacao(3.0) { a, b -> a / b }
    numero.finalizar { println(it) }
}

class Numero(var valor: Double) {
    fun operacao(numero: Double, funcao: (Double, Double) -> Double): Numero {
        return Numero(funcao(valor, numero))
    }

    fun finalizar(funcao: (Double) -> Unit) {
        funcao(valor)
    }
}


/*
Funcional - Exercícios
Estrutura de Dados e Paradigmas de Programação
1- Escreva um programa que de forma funcional exibe uma lista de valores especificados.
A - Números pares de 0 a 50
B - Números divisíveis por 3, multiplicados por 5
C - Números de 0 a 10 menos os números (4, 7, 9)
D - Números de 1 a 10 multiplicados

2- (Desafio) Crie um programa que de forma funcional realiza operações com um número real.
Crie uma classe Numero que contém como atributo valor do tipo Double.
Métodos:
• operacao: Recebe como argumento um numero Double e uma operacao do tipo funcao.
Esse método devolve outro objeto do tipo Numero que contem como valor o resultado da
funcao operacao.
• finalizar: Recebe como parametro uma outra funcao que recebe um Double como
parametro e retorna void. O método finalizar deve chamar essa função passando o valor
armazenado como argumento.
Operações:
Sem utilizar variáveis (val ou var) crie um objeto da classe número passando o valor 2.0 no
construtor. Faça uma operação de soma passando o número 4.0 como argumento. Faça uma
operação de divisao passando o valor 3.0 como argumento. Utilizando o método finalizar, exiba o
valor final das operações.
 */