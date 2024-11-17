package org.example

import java.io.FileReader
import java.io.FileWriter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Formatter
import java.util.Scanner

fun main() {
    val musicas = mutableListOf<Musica>()
    musicas.addAll(
        listOf(
            Musica(1, "Nonsense", "Sabrina Carpenter", 2.53, 2022, "Pop", "Emails I Can't Send", "Island Records"),
            Musica(2, "Dynamite", "BTS", 3.19, 2020, "Pop", "BE", "Big Hit Entertainment"),
            Musica(3, "Hush", "The Marías", 2.50, 2021, "Indie Pop", "Cinema", "Nice Life Recording Company"),
            Musica(4, "Skin", "Sabrina Carpenter", 3.01, 2021, "Pop", "Skin (Single)", "Island Records")
        )
    )

    var opcao = 0
    while (opcao != 7) {
        println("1 - Cadastrar")
        println("2 - Exibir a lista")
        println("3 - Gravar csv")
        println("4 - Gravar txt")
        println("5 - Ler csv")
        println("6 - Ler txt")
        println("7 - Fim")
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
                gravarTxt(musicas, nomeArquivo)
            }

            5 -> {
                print("Digite o nome do arquivo: ")
                val nomeArquivo = readLine()!!
                val musicasLidas = lerCsv(nomeArquivo)
                musicas.clear()
                musicas.addAll(musicasLidas)
            }

            6 -> {
                // TO DO
            }

            7 -> println("Fim")
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

fun gravarTxt(musicas: List<Musica>, nomeArquivo: String) {
    if (musicas.isEmpty()) {
        println("Lista vazia. Não há nada a gravar!")
        return
    }

    val arquivo = FileWriter(nomeArquivo)
    val saida = Formatter(arquivo)

    // Escrevendo header do arquivo
    var header = "00MUSICAS"
    header += LocalDateTime.now()
        .format(
            DateTimeFormatter
                .ofPattern("dd-MM-yyyy HH:mm:ss")
        )
    header += "01"

    saida.format(header + "\n")

    // Escrevendo corpo do arquivo

    for (musica in musicas) {
        val linha = StringBuilder()
        linha.append("02")
        linha.append(String.format("%04d", musica.id))
        linha.append(String.format("%-40.40s", musica.nome))
        linha.append(String.format("%-30.30s", musica.autor))
        linha.append(String.format("%05.2f", musica.duracao))
        linha.append(String.format("%04d", musica.anoLancamento))
        linha.append(String.format("%-15.15s", musica.genero))
        linha.append(String.format("%-40.40s", musica.album))
        linha.append(String.format("%-30.30s", musica.gravadora))

        // Adiciona a linha formatada no arquivo de saída
        saida.format(linha.toString() + "\n")
    }

    // Gravando registro do trailer
    var trailer = "01"
    trailer += String.format("%010d", musicas.size)

    saida.format(trailer + "\n")

    saida.close()
    arquivo.close()
}

/*
Gravar arquivo TXT
Se a lista estiver vazia, exiba mensagem de "Lista vazia. Não há nada a gravar!"
Se a lista não estiver vazia, gravar o arquivo e ao final exiba "Gravação efetuada com sucesso!"

Para gravação do arquivo txt, utilize o documento de layout criado no exercício EDP-27
Lembrando que o documento de layout precisa estar de acordo com os atributos definidos em sua classe de tema livre.
 */
