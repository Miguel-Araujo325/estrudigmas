import java.text.Normalizer
import java.util.*

fun main() {
    var frase1 = "subi no ônibus"
    var frase2 = "a torre da derrota"
    var frase3 = "nao eh palindromo"

    println("==== Primeira Frase ====")
    println(if(ehPalindromo(frase1)) "É palíndromo" else "Não é palíndromo")
    println()

    println("==== Segunda Frase ====")
    println(if(ehPalindromo(frase2)) "É palíndromo" else "Não é palíndromo")
    println()

    println("==== Terceira Frase ====")
    println(if(ehPalindromo(frase3)) "É palíndromo" else "Não é palíndromo")
    println()
}

fun ehPalindromo(frase: String): Boolean {
    var pilha = Stack<Char>()
    var frase = removerAcentos(frase).replace(" ", "").toLowerCase();
    for (indice in frase.indices) {
        pilha.push(frase[indice])
    }

    for (indice in frase.indices) {
        if (frase[indice] != pilha.pop()) {
            return false
        }
    }

    return true
}

fun removerAcentos(texto: String): String {
    return Normalizer.normalize(texto, Normalizer.Form.NFD)
        .replace(Regex("\\p{InCombiningDiacriticalMarks}"), "")
}

/*
- Implementar um programa que utilize uma pilha para verificar se uma dada cadeia de
caracteres é ou não palíndroma. Uma cadeia de caracteres é palíndroma quando tem a
mesma leitura, lendo-se da esquerda para direita ou da direita para esquerda (sem
considerar os espaços em branco, tracinho, acento, letra maiúscula/minúscula).
Por exemplo: radar, ovo, Ana, subi no ônibus, Socorram-me subi no ônibus em Marrocos,
anotaram a data da maratona, a torre da derrota.
 */