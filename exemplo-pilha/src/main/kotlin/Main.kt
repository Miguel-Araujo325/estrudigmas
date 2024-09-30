package org.example

import java.util.Stack

fun main() {
    //Criação da pilha
    val pilha = Stack<String>()

    // adicionando elementos na pilha
    pilha.push("yoongi")
    pilha.push("agustd")
    pilha.push("suga")

    // olhando o ultimo elementp
    println("O ultimo elemento é: ${pilha.peek()}")

    // removendo elemento
    println("reomovendo o elemento: ${pilha.pop()}")

    
}