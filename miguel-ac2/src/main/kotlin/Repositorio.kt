package org.example

import java.util.*
import java.util.concurrent.ArrayBlockingQueue

class Repositorio {
    val map = mutableMapOf<String, String>()
    val pilha = Stack<Info>()
    val fila = ArrayBlockingQueue<String>(10)

    fun salvar(ra: String, nome: String) {
        map[ra] = nome
    }

    fun deletar(ra: String) {
        if (!map.containsKey(ra)) {
            println("Aluno inexistente")
            return
        }
        val info = Info(ra, map[ra]!!)
        pilha.push(info)
        map.remove(ra)
    }

    fun exibir() {
        println(map)
    }

    fun desfazer(quantidade: Int) {
        if (pilha.isEmpty()) {
            println("Não há nada a desfazer")
            return
        }
        if (quantidade < 0 || quantidade > pilha.size) {
            println("Quantidade inválida")
            return
        }
        for (i in 1..quantidade) {
            val info = pilha.pop()
            salvar(info.ra, info.nome)
        }
    }

    fun agendarDeletar(ra: String) {
        fila.add(ra)
    }

    fun executarAgendado() {
        if (fila.isEmpty()) {
            println("Não há operações agendadas")
            return
        }
        val ra = fila.poll()
        deletar(ra)
    }
}
/*
2) Classe Repositorio – essa classe será responsável por armazenar os valores dos RAs e os nomes dos alunos. Dessa forma, ela terá como atributo:

(a) map que é do tipo Mutable<String, String>, inicialmente vazio

(b) pilha do tipo Info (utilize a classe Stack para pilha)

(c) fila do tipo String de tamanho 10 (utilize a classe ArrayBlockingQueue para fila)

3) Métodos da classe Repositorio:

(a) salvar – recebe o ra e o nome do aluno como argumentos; esse método deve salvar o ra e o nome do aluno no map

(b)  deletar – recebe o ra do aluno como argumento; esse método deve verificar se o ra existe no map. Se não existir, deve exibir na console a mensagem "Aluno inexistente", senão deve remover do map esse aluno, e antes de remover, deve criar um objeto Info com o ra e o nome do aluno a ser deletado e esse objeto Info deve ser empilhado, para que possa ser desfeito posteriormente. Para remover do map, use o método remove, passando a chave como argumento.

(c) exibir – exibe na console o conteúdo do map

(d) desfazer – recebe a quantidade de operações a serem desfeitas; se a pilha estiver vazia, exibe na console a mensagem “Não há nada a desfazer”, se a quantidade de operações recebida como argumento for menor do que zero ou maior do que a quantidade de operações na pilha, exibe na console a mensagem “Quantidade inválida”, senão deve desempilhar a quantidade de operações desejadas, uma por vez, e chamar a operação inversa ao deletar.

(e) agendarDeletar – recebe o ra do aluno como argumentos; esse método enfileira a ação de deletar; para isso, enfileira  o ra recebido como argumento.

(f) executarAgendado – não recebe argumentos. Se a fila estiver vazia, exibe na console a mensagem "Não há operações agendadas". Senão, remove um valor da fila e chama o método deletar (essa operação pode ser desfeita tb).
 */