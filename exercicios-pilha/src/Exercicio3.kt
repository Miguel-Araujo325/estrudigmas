import java.util.*

fun main() {
    var frase = "O rato roeu a roupa do rei de Roma"
    inverterFrase(frase)
}

fun inverterFrase(frase: String) {
    var pilha = Stack<Char>()
    for (indice in frase.indices) {
        pilha.push(frase[indice])
    }

    while (!pilha.isEmpty()) {
        print(pilha.pop())
    }

    println()
}

/*
3- Implementar um programa que utilize uma pilha para ler uma frase e exibi-la invertida.
Neste caso, o elemento da pilha deve ser do tipo Character.
Ex: a frase “A pilha do gato” deve sair “otag od ahlip A”
Dica Kotlin: para trabalhar com cada caractere da String, pode-se obter cada caractere
da String, utilizando variavelTexto[indice]
Ex: for (indice in frase.indices) {
 println(frase[indice])
 }

 */