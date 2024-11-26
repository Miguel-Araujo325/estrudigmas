import java.io.FileReader
import java.io.FileWriter
import java.io.PrintWriter
import java.util.*

val pacientes = mutableListOf<Paciente>()
val linha = "--------------------------------------------------"

fun main() {

    // 1- Criar uma lista mutável de objetos Paciente
    // Criado globalmente

    /* 2- Ler o arquivo paciente.txt que esta na pasta de projeto,
          criar um objeto Paciente para cada registro de dados do arquivo
          e adicionar esse objeto a lista criada acima.
          Mas atencao: se o paciente for prioritario, ele devera entrar no
          indice zero da lista, usando add(0,objeto)
          Se o paciente nao for prioritario, efetue add normal no fim da lista
          Atencao tambem para nao ficar com brancos excedentes nas variaveis texto
          A leitura deve seguir o documento de layout que esta na pasta do projeto
     */
    println("Lendo arquivo paciente.txt")
    lerTxt()

    println(linha)
    println("Lista de pacientes")

    // 3- Exiba a lista de pacientes na console, sem usar saida formatada
    for (paciente in pacientes) {
        println(paciente)
    }

    // 4- Grave o conteudo da lista num arquivo paciente.csv, que devera ser entregue
    //    na pasta do projeto

    println(linha)
    println("Gravando arquivo paciente.csv")
    gravarCsv()

    // 5- Leia o arquivo paciente.csv e exiba com saida formatada
    //    Nao se esqueca dos titulos das colunas
    println(linha)
    println("Lendo arquivo paciente.csv")
    lerCsv()
}

fun lerTxt() {
    val arquivo = FileReader("paciente.txt")
    val leitor = Scanner(arquivo)

    while (leitor.hasNext()) {
        val linha = leitor.nextLine()
        val registro = linha.substring(0, 2)
        when (registro) {
            // Header
            "00" -> {
                val conteudo = linha.substring(2, 10)
                val dataHora = linha.substring(10, 29)
                val versao = linha.substring(29, 31)

                println("Conteúdo do arquivo: $conteudo")
                println("Data/Hora: $dataHora")
                println("Versão: $versao")
            }

            // Conteudo
            "02" -> {
                val id: Int = linha.substring(2, 7).trim().toInt()
                val prioritario: Boolean = linha.substring(7, 12).trim().toBoolean()
                val nome: String = linha.substring(12, 42).trim()
                val sintomas: String = linha.substring(42, 62).trim()
                val idade: Int = linha.substring(62, 65).trim().toInt()
                val peso: Double = linha.substring(65, 71).replace(",", ".").toDouble()

                if (prioritario) {
                    pacientes.add(0, Paciente(id, nome, prioritario, sintomas, idade, peso))
                } else {
                    pacientes.add(Paciente(id, nome, prioritario, sintomas, idade, peso))
                }
            }

            // Trailer
            "01" -> {
                val qtdRegistros = linha.substring(2, 7).toInt()
                if (qtdRegistros == pacientes.size) {
                    println("Quantidade de registros corresponde ao valor informado")
                } else {
                    println("Quantidade de registros não corresponde ao valor informado")
                }
            }
        }
    }
    leitor.close()
    arquivo.close()
}

fun gravarCsv() {
    val arquivo = FileWriter("paciente.csv")
    val saida = PrintWriter(arquivo)

    for (paciente in pacientes) {
        saida.println("${paciente.id};${paciente.prioritario};${paciente.nome};${paciente.sintomas};${paciente.idade};${paciente.peso}")
    }

    // Fechar arquivo
    saida.close()
    arquivo.close()
}

fun lerCsv() {
    val arquivo = FileReader("paciente.csv")
    val leitor = Scanner(arquivo).useDelimiter("[;\\n]")

    // Cabeçalho
    println(
        String.format(
            "%5s | %5s | %-30.30s | %-20.20s | %3s | %6s",
            "ID", "PRIORITÁRIO", "NOME", "SINTOMAS", "IDADE", "PESO"
        )
    )

    while (leitor.hasNext()) {
        val id = leitor.nextInt()
        val prioritario = leitor.nextBoolean()
        val nome = leitor.next()
        val sintomas = leitor.next()
        val idade = leitor.nextInt()
        val peso = leitor.next().toDouble()

        println(
            String.format(
                "%5d | %11s | %-30.30s | %-20.20s | %5d | %6.2f",
                id, prioritario, nome, sintomas, idade, peso
            )
        )
    }

    leitor.close()
    arquivo.close()
}
