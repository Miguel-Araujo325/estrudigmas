package org.example

import java.util.*
import java.util.concurrent.ArrayBlockingQueue

fun main() {
    val repositorio =
        Repositorio(lista = mutableListOf(), pilha = Stack<Musica>(), fila = ArrayBlockingQueue<Musica>(10));
    var opcao = 0;
    while (opcao != 7) {
        println("1- Salvar objeto")
        println("2- Deletar objeto")
        println("3- Exibir")
        println("4- Desfazer")
        println("5- Agendar salvar")
        println("6- Executar agendado")
        println("7- Fim")
        opcao = readLine()!!.toInt();
        when (opcao) {
            1 -> {
                println("Digite o nome da música")
                val nome = readLine()!!
                println("Digite o autor da música")
                val autor = readLine()!!
                println("Digite a duração da música")
                val duracao = readLine()!!.toDouble()
                val musica = if (repositorio.pilha.isNotEmpty()) {
                    Musica(repositorio.pilha.lastElement().id + 1, nome, autor, duracao)
                } else {
                    Musica(100, nome, autor, duracao)
                }
                repositorio.salvar(musica)
            }

            2 -> {
                println("Digite o id da música a ser deletada")
                val id = readLine()!!.toInt()
                repositorio.deletar(id)
            }

            3 -> {
                repositorio.exibir()
            }

            4 -> {
                repositorio.desfazer()
            }

            5 -> {
                println("Digite o nome da música")
                val nome = readLine()!!
                println("Digite o autor da música")
                val autor = readLine()!!
                println("Digite a duração da música")
                val duracao = readLine()!!.toDouble()
                val musica = Musica(100 + repositorio.lista.size, nome, autor, duracao)
                repositorio.salvar(musica)
            }

            6 -> {
                println("Digite a quantidade de operações agendadas a serem executadas")
                val qtdOperacoes = readLine()!!.toInt()
                repositorio.executarAgendado(qtdOperacoes)
            }

            7 -> {
                println("Fim")
            }

            else -> {
                println("Opção inválida")
            }
        }
    }
}
/*
2- Arquivo Main, no método main:

(a) Crie um objeto Repositorio
(b) Fique num loop, exibindo o menu:
1- Salvar objeto
2- Deletar objeto
3- Exibir
4- Desfazer
5- Agendar salvar
6- Executar agendado
7- Fim

Se o usuário digitar:
Opção 1: solicite que o usuário digite os valores dos atributos da sua classe tema, crie um objeto da sua classe tema, e chama o método salvar do repositorio, passando esse objeto. O ID deve ser a partir de 100. Se preferir, pode deixar o id ser automático. Ou seja, seu programa controla o valor do id, sem que o usuário precise digitar esse valor.
Opção 2: solicite que o usuário digite o ID do objeto a ser deletado. Chame o método deletar do repositorio, passando esse ID.
Opção 3: chama o método exibir do repositorio.
Opção 4: chama o método desfazer do repositorio.
Opção 5: solicita que o usuário digite os valores dos atributos dos objetos da classe tema, instancia um objeto com os valores digitados e chamao método agendarSalvar da classe Repositorio.
Opção 6: solicita que o usuário digite a quantidade de operações agendadas a serem executadas. Chama o método executarAgendado da classe Repositorio, passando como argumento a quantidade lida.
Opção 7: encerra o programa
Qualquer outra opção diferente de 1, 2, 3, 4, 5, 6, 7 exiba mensagem de opção inválida e continue no loop.
 */