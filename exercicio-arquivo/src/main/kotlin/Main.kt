package org.example

import java.io.FileReader
import java.io.FileWriter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Formatter
import java.util.Scanner

val musicas = mutableListOf<Musica>()

fun main() {
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
                if (musicas.isEmpty()) {
                    println("Lista vazia")
                } else {
                    imprimirMusicas()
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
                lerCsv(nomeArquivo)
                imprimirMusicas()
            }

            6 -> {
                print("Digite o nome do arquivo: ")
                val nomeArquivo = readLine()!!
                letTxt(nomeArquivo)
            }

            7 -> println("Fim")
            else -> println("Opção inválida")
        }
    }
}

fun imprimirMusicas() {
    // Cabeçalho
    println(
        String.format(
            "%5S | %-20S | %-15S | %8S | %12S | %-10S | %-15S | %-15S",
            "ID",
            "NOME",
            "AUTOR",
            "Duração",
            "Ano Lançamento",
            "Gênero",
            "Álbum",
            "Gravadora"
        )
    )
    // Imprime as músicas
    for (musica in musicas) {
        println(
            String.format(
                "%5d | %-20.20s | %-15.15s | %8.2f | %14d | %-10.10s | %-15.15s | %-15.15s",
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

// CSV -> Comma Separated Values
fun gravarCsv(musicas: List<Musica>, nomeArquivo: String) {
    if (musicas.isEmpty()) {
        println("Lista vazia")
        return
    }

    //Inicializa as variáveis de arquivo e saída

    // FileWriter é uma classe que permite escrever em um arquivo de texto
    val arquivo = FileWriter(nomeArquivo)
    // Formatter é uma classe que permite escrever em um arquivo de texto formatando os dados
    val saida = Formatter(arquivo)

    // Escreve o conteúdo da lista no arquivo, os separando por ";"
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

    // Fecha o arquivo
    arquivo.close()
    // Fecha o Formatter
    saida.close()
}

fun lerCsv(nomeArquivo: String) {
    if (nomeArquivo.equals("")) {
        println("Nome do arquivo inválido")
        return
    } else if (!nomeArquivo.endsWith(".csv")) {
        println("Arquivo inválido")
        return
    }

    //Inicializa as variáveis de arquivo e leitor
    // FileReader é uma classe que permite ler um arquivo de texto
    val arquivo = FileReader(nomeArquivo)
    // Scanner é uma classe que permite ler um arquivo de texto
    val leitor = Scanner(arquivo).useDelimiter("[;\\n]")

    //While para percrrer o arquivo
    while (leitor.hasNext()) {
        val id = leitor.nextInt()
        val nome = leitor.next()
        val autor = leitor.next()
        val duracao = leitor.nextDouble()
        val anoLancamento = leitor.nextInt()
        val genero = leitor.next()
        val album = leitor.next()
        val gravadora = leitor.next()
        musicas.add(Musica(id, nome, autor, duracao, anoLancamento, genero, album, gravadora))
    }

    //Fecha o leitor
    leitor.close()
    //Fecha o arquivo
    arquivo.close()
}

// TXT -> Text
fun gravarTxt(musicas: List<Musica>, nomeArquivo: String) {
    if (musicas.isEmpty()) {
        println("Lista vazia")
        return
    }

    // Inicializando variáveis de arquivo e saída
    // FileWriter é uma classe que permite escrever em um arquivo de texto
    val arquivo = FileWriter(nomeArquivo)
    // Formatter é uma classe que permite escrever em um arquivo de texto formatando os dados
    val saida = Formatter(arquivo)

    // Escrevendo header do arquivo
    var header = "00MUSICAS"
    header += LocalDateTime.now()
        .format(
            DateTimeFormatter
                .ofPattern("dd-MM-yyyy HH:mm:ss")
        )
    header += "01"

    // Escrevendo header no arquivo
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

        // Escrevendo linha no arquivo
        saida.format(linha.toString() + "\n")
    }

    // Trailer
    var trailer = "01"
    trailer += String.format("%05d", musicas.size)

    //Escrevendo trailer no arquivo
    saida.format(trailer + "\n")

    // Fechar arquivo
    saida.close()
    arquivo.close()
}

fun letTxt(nomeArquivo: String) {
    if (nomeArquivo.equals("")) {
        println("Nome do arquivo inválido")
        return
    } else if (!nomeArquivo.endsWith(".txt")) {
        println("Arquivo inválido")
        return
    }

    // Inicializando variáveis de arquivo e leitor
    // FileReader é uma classe que permite ler um arquivo de texto
    val arquivo = FileReader(nomeArquivo)
    // Scanner é uma classe que permite ler um arquivo de texto
    val leitor = Scanner(arquivo)

    while (leitor.hasNext()) {
        val linha = leitor.nextLine()
        val registro = linha.substring(0, 2)
        when(registro){
            // Header
            "00" -> {
                val conteudo = linha.substring(2, 9)
                val dataHora = linha.substring(9, 28)
                val versao = linha.substring(28, 30)

                println("Conteúdo do arquivo: $conteudo")
                println("Data/Hora: $dataHora")
                println("Versão: $versao")
            }

            // Conteudo
            "02" -> {
                val id = linha.substring(2, 6).trim().toInt()
                val nome = linha.substring(6, 46).trim()
                val autor = linha.substring(46, 76).trim()
                val duracao = linha.substring(76, 81).replace(",", ".").toDouble()
                val anoLancamento = linha.substring(81, 85).toInt()
                val genero = linha.substring(85, 100).trim()
                val album = linha.substring(100, 140).trim()
                val gravadora = linha.substring(140, 170).trim()
                musicas.add(Musica(id, nome, autor, duracao, anoLancamento, genero, album, gravadora))
            }

            // Trailer
            "01" -> {
                val qtdRegistros = linha.substring(2, 7).toInt()
                if (qtdRegistros == musicas.size) {
                    println("Quantidade de registros corresponde ao valor informado")
                } else {
                    println("Quantidade de registros não corresponde ao valor informado")
                }
            }
        }
    }

    // Fechar arquivo
    leitor.close()
    arquivo.close()

    // Imprimir músicas
    imprimirMusicas()
}

