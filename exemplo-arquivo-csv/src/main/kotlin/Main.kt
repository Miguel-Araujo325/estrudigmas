package org.example

import java.io.FileReader
import java.io.FileWriter
import java.util.Formatter
import java.util.Scanner

fun main() {
    //Passo 1 - Gerar uma lista com dados
    val cachorros = mutableListOf(
        Cachorro(1, "Billy", "Grande", 20.0),
        Cachorro(2, "Max Alfredo da Silva", "Médio", 10.5),
        Cachorro(3, "Borboleta Ta na Cozinha Fazendo Chocolate", "Grande", 20.0),
        Cachorro(4, "Toto", "Pequeno", 5.0),
        Cachorro(5, "Marley", "Pequeno", 5.0)
    );

    // Passo 2 - Exportar lista para csv
    gravarCsv(cachorros, "pets.csv");

    // Passo 3 - Ler arquivo csv e exibir em formato de tabela
    lerCsv("pets.csv")
}

fun gravarCsv(lista: List<Cachorro>, nome: String){
    val arquivo = FileWriter(nome);
    val saida = Formatter(arquivo);

    for(cachorro in lista){
        saida.format("%d;%s;%s;%.2f\n", cachorro.id, cachorro.nome, cachorro.porte, cachorro.peso);
    }

    saida.close();
    arquivo.close();
}

fun lerCsv(nome: String){
    val arquivo = FileReader(nome);
    val leitor = Scanner(arquivo).useDelimiter("[;\\n]");

    //Cabeçalho
    println(String.format("%5S | %-10S | %-10S | %5S", "id", "nome", "porte", "peso"));

    while (leitor.hasNext()){
        val id = leitor.nextInt();
        val nome = leitor.next();
        val porte = leitor.next();
        val peso = leitor.nextDouble();
        println(String.format("%05d | %-10.10S | %-10.10S | %5.2f", id, nome, porte, peso));
    }

    leitor.close()
    arquivo.close()
}