package org.example

import java.util.concurrent.ArrayBlockingQueue

fun main() {
    var fila = ArrayBlockingQueue<String>(10);

    fila.add("Item 1")
    fila.add("Item 2")
    fila.add("Item 3")

    println("Verificando elementos da fila: $fila")

    //Removendo um elemento
    println("Removendo item da fila ${fila.poll()}")

    println("Verificando elementos da fila: $fila")

    println("Verificando o próximo elemento, mas sem removelo: ${fila.peek()}")

    //Criano uma fila de letras
    var filaLetras = ArrayBlockingQueue<String>(10)

    filaLetras.add("F")
    filaLetras.add("I")
    filaLetras.add("L")
    filaLetras.add("A")

    //Exibindo as letras até q o vetor esteja fazio
    while(filaLetras.isNotEmpty()){
        println(filaLetras.poll())
    }
}