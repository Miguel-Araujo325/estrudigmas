package org.example

fun main() {
    val gerenciador = GerenciadorMusica()

    while (true) {
        println("-------- Menu --------")
        println("1 - Adicionar item")
        println("2 - Remover item")
        println("3 - Remover último item")
        println("4 - Exibir itens")
        println("5 - Buscar item")
        println("6 - Atualizar item")
        println("7 - Gerar relatório")
        println("0 - Sair")
        print("Escolha uma opção: ")

        when (readLine()?.toIntOrNull()) {
            1 -> gerenciador.adicionarMusica()
            2 -> gerenciador.removerMusica()
            3 -> gerenciador.removerUltimaMusica()
            4 -> gerenciador.exibirMusicas()
            5 -> gerenciador.buscarMusica()
            6 -> gerenciador.atualizarMusica()
            7 -> gerenciador.gerarRelatorio()
            0 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida!")
        }
    }
}