package org.example

import java.util.*
import java.util.concurrent.ArrayBlockingQueue

class Repositorio(
    val lista: MutableList<Musica>,
    val pilha: Stack<Musica>,
    val fila: ArrayBlockingQueue<Musica> = ArrayBlockingQueue<Musica>(10)
) {
    fun salvar(musica: Musica) {
        pilha.add(musica);
        agendarSalvar(musica)
    }

    fun deletar(id: Int) {
        val musica = lista.find { it.id == id }
        if (musica != null) {
            lista.remove(musica)
        } else {
            println("ID inexistente")
        }
    }

    fun exibir() {
        if (lista.isNotEmpty()) {
            for (musica in lista) {
                println(musica.toString())
            }
        } else {
            println("Repositório vazio")
        }
        println(if (fila.isNotEmpty()) "Último elemento da fila ${fila.peek().toString()}" else "A fila está vazia")
        println(if (pilha.isNotEmpty()) "Último elemento da pilha ${pilha.peek().toString()}" else "A pilha está vazia")
        println()
    }

    fun desfazer() {
        if (pilha.isNotEmpty()) {
            deletar(pilha.pop().id)
        } else {
            println("Não há nada a desfazer")
        }
    }

    fun agendarSalvar(musica: Musica) {
        if (fila.size != 10) {
            fila.add(musica)
        } else {
            println("Fila Cheia! Salve os registros antes de agendar um novo!")
        }
    }

    fun executarAgendado(qtdOperacoes: Int) {
        if (fila.isNotEmpty() && qtdOperacoes > 0 && qtdOperacoes < fila.size + 1) {
            for (i in 0..<qtdOperacoes) {
                lista.add(fila.poll())
            }
        } else {
            println("Não há operações agendadas")
        }
    }
}
/*
1- Dessa forma, crie uma classe chamada Repositorio.

(a) Atributos de Repositorio:
lista : MutableList<Classe tema>  -   (lista mutable de objetos da ClasseTema)
pilha: Stack<Int>
fila: ArrayBlockingQueue<Classe tema>

(b) Construtor de Repositorio
- Instancia os atributos lista, pilha e fila. A fila pode ser instanciada com tamanho 10.

(c) Métodos de Repositorio

(c1) salvar, do tipo void, recebe como argumento um objeto do tipo ClasseTema.
Esse método adiciona esse objeto à lista. Como o método salvar pode ser desfeito, empilha o id do objeto na pilha.

(c2) deletar, do tipo void, recebe como argumento um inteiro id, do objeto a ser deletado.
Esse método verifica se o objeto com id igual ao argumento existe na lista. Se existir, remove esse objeto da lista. Se não existir, exibe a mensagem "ID inexistente". Obs: Não confundam o id do objeto com o índice da lista. O id pode ser 100 e estar no índice zero da lista. Você deve percorrer a lista para encontrar o objeto da lista cujo id seja o id desejado. Para remover da lista, vc pode usar o método remove da lista, passando como argumento o próprio objeto ou o índice (que é diferente do ID) do objeto na lista. Se vc usar uma variável para ser o índice da lista, essa variável deve ser int e não Integer.

(c3) exibir, do tipo void, não recebe argumentos.
Esse método verifica se a lista está vazia. Se estiver, exibe "Repositório vazio", senão exibe o conteúdo da lista.
Esse método também exibe o conteúdo da pilha e da fila.

(c4) desfazer, do tipo void, não recebe argumentos.
Esse método verifica se a pilha está vazia. Se estiver, exibe mensagem "Não há nada a desfazer". Senão, desempilha um id da pilha e chama o deletar, passando esse id, para desfazer a última operação de salvar.

(c5) agendarSalvar, do tipo void, recebe como argumento um objeto do tipo ClasseTema.
Esse método enfileira o argumento recebido na fila, para que seja executado posteriormente.

(c6) executarAgendado, do tipo void, recebe como argumento um inteiro qtdOperacoes, com o valor da quantidade de operações a serem executadas da fila. Esse método verifica se a fila está vazia. Se estiver, exibe mensagem “Não há operações agendadas”. Se a fila não estiver vazia, valide o argumento, exibindo mensagem “Quantidade inválida” se o argumento for menor ou igual a zero ou maior do que o tamanho da fila. Retire da fila a quantidade desejada de operações, executando uma a uma.
 */