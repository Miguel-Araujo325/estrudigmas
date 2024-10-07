val mapContatos = mutableMapOf<Char, String>();
fun main() {
     while (true) {
         println("1 – Inserir contato")
         println("2 – Exibir contatos")
         println("0 - Sair")
         val opcao = readln().toInt()
         when (opcao) {
             1 -> inserirContato()
             2 -> exibirContatos()
             0 -> break
             else -> println("Opção inválida")
         }
     }
}

fun inserirContato(){
    println("Digite o nome do contato")
    val nome = readln()
    val letra = nome.toUpperCase().first()
    mapContatos[letra] = nome;
}

fun exibirContatos() {
    val mapContatosOrdenado = mapContatos.toSortedMap()
    mapContatosOrdenado.forEach { (letra, nome) ->
        println("[$letra]")
        println(nome)
    }
}

//2- Escreva um programa que contenha um menu com as opções:
//1 – Inserir contato
//2 – Exibir contatos
//0 - Sair
//A opção 1 deve inserir um novo contato na lista de contatos
//A opção 2 deve exibir os contatos cadastrados agrupando pela primeira letra do nome.
//Exemplo:
//[C]
//Camila Souza
//Célia Taniwaki
//[M]
//Manoel Almeida
//[P]
//Pedro Lucas