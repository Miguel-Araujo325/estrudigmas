package org.example

fun main(){
    // Criando vetor com valores inteiros
    var vetor1 = arrayOf(1, 2, 3)

    // Criando vetor com valores de texto
    var veto2 = arrayOf("a", "b", "c")

    // Criando um vetor de inteiros com 100 posições iniciados com 0
    var vetor3 = Array(100){0}

    // Iterando vetor normalmente
    for(i in vetor1){
        println(i)
    }

    // Iterando vetor de trás para frente
    for(i in vetor1.indices.reversed()){
        println(vetor1[i])
    }

    // Criando uma variável sem inicializar o vetor
    var vetor4: Array<Double>

    // Inicializando vetor com o tamanho específicado pelo usuário
    var tamanho = readln().toInt()

    var notas = Array(tamanho){0.0}

    // Guardando valores especificados pelo usuários no vetor
    for(i in notas.indices){
        println("Digite o valor da nota ${i + 1}")
        notas[i] = readln().toDouble()
    }

    //Exibindo vetor
    for(i in notas.indices){
        println(print("1° Nota: ${notas[i]}"))
    }

    // Calculando a média das notas
    var soma = 0.0

    var media = soma / notas.size

    println("média: ${media}")

    println(media)
    println("Média ${notas.average()}")
}