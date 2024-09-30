package org.example

class Exercicio3 : IMain {
    override fun main() {
        var array = Array(10) { "" }
        for (i in array.indices) {
            println("Digite um nome")
            array[i] = readln()
        }

        println("Digite um nome para pesquisar")
        var nome = readln()

        var index = array.indexOf(nome)
        if (index != -1) {
            println("Nome encontrado no índice $index")
        } else {
            println("Nome não encontrado")
        }
    }
}
//3.  Escreva um programa que cria um vetor para armazenar 10 Strings. O programa deve solicitar que o usuário digite 10 nomes, que devem ser armazenados nesse vetor.
//Depois, o programa deve pedir que se digite um nome qualquer. O programa deverá pesquisar se esse nome está no vetor.
//Se estiver, deve exibir a mensagem: “Nome encontrado no índice x”, sendo x o índice do nome no vetor, senão deve exibir uma mensagem de “Nome não encontrado”.