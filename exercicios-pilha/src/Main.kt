import java.util.*

fun main() {
    var vetor = intArrayOf(1, 3, 3, 1)
    var vetor2 = intArrayOf(10, 20, 30 , 40)

    println("==== Primeiro Vetor ====")
    println(if(ehPalindromo(vetor)) "É palíndromo" else "Não é palíndromo")
    println()
    println("==== Segundo Vetor ====")
    println(if(ehPalindromo(vetor2)) "É palíndromo" else "Não é palíndromo")
}

fun ehPalindromo(vetor: IntArray): Boolean {
    var pilha = Stack<Int>()

    for(e in vetor) {
        pilha.push(e)
    }

    for (e in vetor) {
        if (e != pilha.pop()) {
            return false
        }
    }

    return true
}
/*
Utilizando a classe Stack, implemente o método ehPalindromo, no arquivo onde está o
main. Esse método recebe um vetor de inteiros e retorna true se a sequência de inteiros no
vetor for palíndroma e retorna false, caso contrário.
No main, inicialize um vetor de inteiros com valores e teste se esse vetor é ou não
palíndromo.
 */