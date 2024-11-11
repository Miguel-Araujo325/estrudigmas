package org.example

import java.io.FileReader
import java.io.FileWriter
import java.util.Formatter
import java.util.Scanner

fun main() {
    val musicas = mutableListOf<Musica>()
    var opcao = 0
    while (opcao != 5) {
        println("1 - Cadastrar")
        println("2 - Exibir a lista")
        println("3 - Gravar csv")
        println("4 - Ler csv")
        println("5 - Fim")
        print("Escolha uma opção: ")
        opcao = readLine()!!.toInt()
        when (opcao) {
            1 -> {
                print("Digite o id: ")
                val id = readLine()!!.toInt()
                print("Digite o nome: ")
                val nome = readLine()!!
                print("Digite o autor: ")
                val autor = readLine()!!
                print("Digite a duração: ")
                val duracao = readLine()!!.toDouble()
                print("Digite o ano de lançamento: ")
                val anoLancamento = readLine()!!.toInt()
                print("Digite o gênero: ")
                val genero = readLine()!!
                print("Digite o álbum: ")
                val album = readLine()!!
                print("Digite a gravadora: ")
                val gravadora = readLine()!!
                musicas.add(Musica(id, nome, autor, duracao, anoLancamento, genero, album, gravadora))
            }

            2 -> {
                println(
                    String.format(
                        "%5S | %-20S | %-15S | %8S | %12S | %-10S | %-15S | %-15S",
                        "ID",
                        "Nome",
                        "Autor",
                        "Duração",
                        "Ano Lançamento",
                        "Gênero",
                        "Álbum",
                        "Gravadora"
                    )
                )
                for (musica in musicas) {
                    println(
                        String.format(
                            "%5d | %-20.20s | %-15.15s | %8.2f | %12d | %-10.10s | %-15.15s | %-15.15s",
                            musica.id,
                            musica.nome,
                            musica.autor,
                            musica.duracao,
                            musica.anoLancamento,
                            musica.genero,
                            musica.album,
                            musica.gravadora
                        )
                    )
                }
            }

            3 -> {
                print("Digite o nome do arquivo: ")
                val nomeArquivo = readLine()!!
                gravarCsv(musicas, nomeArquivo)
            }

            4 -> {
                print("Digite o nome do arquivo: ")
                val nomeArquivo = readLine()!!
                val musicasLidas = lerCsv(nomeArquivo)
                musicas.clear()
                musicas.addAll(musicasLidas)
            }

            5 -> println("Fim")
            else -> println("Opção inválida")
        }
    }
}

fun gravarCsv(musicas: List<Musica>, nomeArquivo: String) {
    if (musicas.isEmpty()) {
        println("Não há nada a gravar")
        return
    }
    val arquivo = FileWriter(nomeArquivo)
    val saida = Formatter(arquivo)
    saida.format("id;nome;autor;duracao;anoLancamento;genero;album;gravadora\n")
    for (musica in musicas) {
        saida.format(
            "%d;%s;%s;%.2f;%d;%s;%s;%s\n",
            musica.id,
            musica.nome,
            musica.autor,
            musica.duracao,
            musica.anoLancamento,
            musica.genero,
            musica.album,
            musica.gravadora
        )
    }
    saida.close()
    arquivo.close()
}

fun lerCsv(nomeArquivo: String): List<Musica> {
    val arquivo = FileReader(nomeArquivo)
    val leitor = Scanner(arquivo).useDelimiter("[;\\n]")
    val musicas = mutableListOf<Musica>()
    leitor.nextLine()

    println(
        String.format(
            "%-5s | %-20s | %-15s | %-8s | %-12s | %-10s | %-15s | %-15s",
            "ID", "Nome", "Autor", "Duração", "Ano Lançamento", "Gênero", "Álbum", "Gravadora"
        )
    )
    println("-".repeat(120))

    while (leitor.hasNext()) {
        val id = leitor.nextInt()
        val nome = leitor.next()
        val autor = leitor.next()
        val duracao = leitor.nextDouble()
        val anoLancamento = leitor.nextInt()
        val genero = leitor.next()
        val album = leitor.next()
        val gravadora = leitor.next()
        println(
            String.format(
                "%-5d | %-20.20s | %-15.15s | %8.2f | %14d | %-10.10s | %-15.15s | %-15.15s",
                id, nome, autor, duracao, anoLancamento, genero, album, gravadora
            )
        )
    }
    leitor.close()
    arquivo.close()
    return musicas
}
