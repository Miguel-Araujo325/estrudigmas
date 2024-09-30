package org.example

import java.util.Scanner

val carrinho: Carrinho = Carrinho()
var opcaoUsuario: Int = 0
var scannerNumerico: Scanner = Scanner(System.`in`);
var scannerTextual: Scanner = Scanner(System.`in`);

fun main() {
    while (opcaoUsuario != 6) {
        println(
            """
            1. Adicionar livro,
            2. Adicionar DVD,
            3. Adicionar Servico,
            4. Exibir itens do carrinho,
            5. Exibir total de venda,
            6. Fim
        """.trimIndent()
        )
        opcaoUsuario = scannerNumerico.nextInt();
        when (opcaoUsuario) {
            1 -> adicionarLivro()
            2 -> adicionarDvd()
            3 -> adicionarServico()
            4 -> carrinho.exibeItensCarrinho()
            5 -> println(carrinho.calculaTotalVenda())
            6 -> {
                scannerNumerico.close()
                scannerTextual.close()
                println("Até a próxima!")
            }
        }
    }
}

fun adicionarLivro() {
    println("Digite o código do produto")
    var codigo: Int = scannerNumerico.nextInt();

    println("Digite o preço de custo do livro")
    var precoCusto: Double = scannerNumerico.nextDouble();

    println("Digite o nome do livro")
    var nome: String = scannerTextual.nextLine();

    println("Digite o nome do autor do livro")
    var autor: String = scannerTextual.nextLine();

    println("Digite o ISBN do livro")
    var isbn: String = scannerTextual.nextLine  ();

    var novoLivro = Livro(codigo, precoCusto, nome, autor, isbn)

    carrinho.adicionaVendavel(novoLivro)
}

fun adicionarDvd() {
    println("Digite o código do produto")
    var codigo: Int = scannerNumerico.nextInt();

    println("Digite o preço de custo do livro")
    var precoCusto: Double = scannerNumerico.nextDouble();

    println("Digite o nome do Dvd")
    var nome: String = scannerTextual.next();

    println("Digite a gravadora do dvd")
    var gravadora: String = scannerTextual.next();

    var novoDvd = Dvd(codigo, precoCusto, nome, gravadora)

    carrinho.adicionaVendavel(novoDvd)
}

fun adicionarServico() {
    println("Digite o código do produto")
    var codigo: Int = scannerNumerico.nextInt();

    println("Digite uma descrição para o serviço")
    var descricao: String = scannerTextual.next();

    println("Digite a quantidade de horas para o serviço")
    var quantHoras: Int = scannerTextual.nextInt();

    println("Digite o valor da horas para o serviço")
    var valorHora: Double = scannerTextual.nextDouble();


    var novoServico = Servico(codigo, descricao, quantHoras, valorHora)

    carrinho.adicionaVendavel(novoServico)
}


/*
Crie um objeto da classe Carrinho, chamado carrinho.
Fique num loop, exibindo um menu, para o usuário escolher uma das opções:
1. Adicionar livro,
2. Adicionar DVD,
3. Adicionar Servico,
4. Exibir itens do carrinho,
5. Exibir total de venda,
6. Fim
Leia a opção digitada pelo usuário com JOptionPane, e utilizando “when”, execute a
opção selecionada.
Na opção 1, peça que o usuário digite os dados do livro e crie um objeto Livro com os
dados digitados. Adicione esse objeto ao carrinho.
Faça o mesmo nas opções 2 e 3, para DVD e Servico, respectivamente.
A opção 4 deve exibir os itens do carrinho.
A opção 5 deve exibir o total de venda dos itens do carrinho.
A opção 6 deve configurar uma variável indicando que é o fim do loop.
 */