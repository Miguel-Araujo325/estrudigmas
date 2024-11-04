package org.example

import java.util.*
import java.util.concurrent.ArrayBlockingQueue

fun main() {
    var vetor1 = arrayOf(2, 7, -3, -50, 45, -4, 30, -21, 38)
    separaPositivoNegativoEmOrdem(vetor1)

    var vetor2 = arrayOf(2, 7, -3, -50, 45, -4, 30, -21, 38)
    separaPositivoNegativoOrdemDiferente(vetor2)
}

fun separaPositivoNegativoEmOrdem(v: Array<Int>) {
    var positivos = ArrayBlockingQueue<Int>(v.size)
    var negativos = ArrayBlockingQueue<Int>(v.size)

    for (i in v) {
        if (i > 0) {
            positivos.add(i)
        } else {
            negativos.add(i)
        }
    }

    while (positivos.isNotEmpty()) {
        print("${positivos.poll()} ")
    }

    while (negativos.isNotEmpty()) {
        print("${negativos.poll()} ")
    }
    println()
}

/*
(Fila) Implemente o método separaPositivoNegativoEmOrdem, que recebe um vetor de
inteiros e deve utilizar duas filas de Int (dois objetos ArrayBlockingQueue<Int>) para
separar os números positivos dos números negativos e exibi-los separados e na ordem
em que estavam no vetor.
Ao final do método, as filas deverão estar vazias.
No método main, crie um vetor qualquer de inteiros, contendo números positivos e
negativos e chame o método separaPositivoNegativoEmOrdem, passando o vetor.
Por exemplo, suponha que o vetor criado no main seja:
v = {2,7,-3,-50,45,-4,30,-21,38}
O método deverá exibir a sequência: 2 7 45 30 38 -3 -50 -4 -21
 */

fun separaPositivoNegativoOrdemDiferente(v: Array<Int>) {3
    var positivos = ArrayBlockingQueue<Int>(v.size)
    var negativos = Stack<Int>()

    for (i in v) {
        if (i > 0) {
            positivos.add(i)
        } else {
            negativos.add(i)
        }
    }

    while (positivos.isNotEmpty()) {
        print("${positivos.poll()} ")
    }

    while (negativos.isNotEmpty()) {
        print("${negativos.pop()} ")
    }

    println()
}

/*
(Pilha e Fila)
No mesmo projeto, implemente o método separaPositivoNegativoOrdemDiferente, que
recebe um vetor de inteiros e deve utilizar um objeto ArrayBlockingQueue<Int> e um
objeto Stack<Int> para separar os números positivos dos números negativos e exibi-los
separados, mas de forma que os números positivos sejam exibidos na ordem em que
estavam no vetor, e os elementos negativos sejam exibidos na ordem inversa em que
estavam no vetor.
Ao final do método, os objetos fila e pilha deverão estar vazios.
No método main, crie um vetor qualquer de inteiros, contendo números positivos e
negativos e chame o método separaPositivoNegativoOrdemDiferente, passando o vetor.
Por exemplo, suponha que o vetor criado no main seja:
v = {2,7,-3,-50,45,-4,30,-21,38}
O método deverá exibir a sequência: 2 7 45 30 38 -21 -4 -50 -3
 */
