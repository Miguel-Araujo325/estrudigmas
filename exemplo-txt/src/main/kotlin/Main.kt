package org.example

import java.io.FileWriter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Formatter
import java.util.Scanner

fun main() {
    var alunos = mutableListOf<Aluno>()

    alunos.add(
        Aluno("03231036", "Edson Morro", "SIS", "Estrudigmas", 8.0, 30)
    );
    alunos.add(
        Aluno("03231012", "Maria Paula", "SIS", "Gestão de Projetos", 8.0, 0)
    );

    escreverAlunosTxt(alunos, "notas.txt");
    lerArquivoTxt("notas.txt");
}

fun escreverAlunosTxt(lista: List<Aluno>, nomeArquivo: String) {
    val arquivo = FileWriter(nomeArquivo);
    val saida = Formatter(arquivo);

    // Header (Cabeçalho)
    var header = "00NOTA20242";
    header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMM-yyyy HH:mm:ss"));
    header += "01";
    saida.format(header + "\n");

    // Body (Corpo)
    for(aluno in lista){
        val linha = StringBuilder();
        linha.append("02");
        linha.append(String.format("%-5.5s", aluno.curso));
        linha.append(String.format("%-8.8s", aluno.ra));
        linha.append(String.format("%-50.50s", aluno.nome));
        linha.append(String.format("%-40.40s", aluno.disciplina));
        linha.append(String.format("%05.2f", aluno.media));
        linha.append(String.format("%03d", aluno.qtdFaltas));
        saida.format(linha.toString() + "\n");
    }

    // Footer (Rodapé || Trailer)
    var trailer = "01";
    trailer += String.format("%010d", lista.size);
    saida.format(trailer + "\n");

    // Fechando os arquivos
    arquivo.close();
    saida.close();
}

fun lerArquivoTxt(nomeArquivo: String) {
    val arquivo = java.io.File(nomeArquivo);
    val leitor = Scanner(arquivo);

    val listaAlunos = mutableListOf<Aluno>();

    while (leitor.hasNext()){
        val linha = leitor.nextLine();
        val registro = linha.substring(0, 2);

        if(registro == "00"){
            val conteudo = linha.substring(2, 6);
            val semestre = linha.substring(6, 11);
            val dataHora = linha.substring(11, 30);
            val versao = linha.substring(30, 32);
            println("Data e Hora: $dataHora");
        }

        if(registro == "02"){
            val curso = linha.substring(2, 7).trim();
            val ra = linha.substring(7, 15).trim();
            val nome = linha.substring(15, 65).trim();
            val disciplina = linha.substring(65, 105).trim();
            val media = linha.substring(105, 110).toDouble();
            val qtdFaltas = linha.substring(110, 113).toInt();

            listaAlunos.add(Aluno(ra, nome, curso, disciplina, media, qtdFaltas));
        }
    }
}