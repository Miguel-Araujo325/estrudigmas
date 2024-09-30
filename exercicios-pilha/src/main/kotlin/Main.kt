package org.example

import java.util.*

fun main() {
    val vetor = arrayOf(1, 3, 3, 1)
    val vetor2 = arrayOf(10, 20, 30, 40)

    println(if (ehPalindromo(vetor)) "é palindromo" else "nao eh")
    println(if (ehPalindromo(vetor2)) "é palindromo" else "nao eh")
}

fun ehPalindromo(v: Array<Int>): Boolean {
    var p = Stack<Int>();

    for (i in 0 until v.size) {
        p.push(v[i])
    }

    for (i in 0 until v.size) {
        if (v[i] != p.pop()) {
            return false
        }
    }

    return true
}

fun converterParaBinario(n: Int): Int {

    return 0
}
/*
2- Conversão de decimal para binário. Implemente o método converterParaBinario, que
recebe um número inteiro em decimal e exibe o seu valor em binário. O método é Unit.
Utilize uma pilha para converter um número de decimal para binário.
Ex: Número 9 – representação em binário: 1001
Número 12 – representação em binário: 1100
Número 32 – representação em binário: 100000
Dica: para converter um número de decimal para binário, devemos dividi-lo
sucessivamente por 2, até que o quociente seja zero. A representação em binário
corresponde aos restos de cada divisão, considerados na ordem inversa.
Assim, basta ir dividindo o número sucessivamente por 2, e ir empilhando os restos, até
que o quociente seja zero. Depois, enquanto a pilha não estiver vazia, desempilhe e
exiba o valor desempilhado.
 */