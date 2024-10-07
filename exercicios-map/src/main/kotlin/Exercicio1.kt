fun main() {
    println("Digite a quantidade de amigos que deseja cadastrar")
    val total = readln().toInt()
    var quantidade = 0
    val mapAmigos = mutableMapOf<String, Long>()

    do {
        println("Digite um nome")
        val nome = readln()
        println("Digite um telefone")
        val telefone = readln().toLong()
        quantidade++
        mapAmigos[nome] = telefone
    } while (quantidade != total)

    println("Digite o nome do amigo que deseja buscar")
    val nomeBusca = readln()
    if (mapAmigos.containsKey(nomeBusca)) {
        println("O telefone de $nomeBusca é ${mapAmigos[nomeBusca]}")
    } else {
        println("Amigo não encontrado")
    }
}

//Escreva um programa que armazena o nome e telefone de diversos amigos diferentes em um
//Map. Peça para o usuário digitar um nome de sua escolha e retorne:
//“O telefone de x é y”
//Onde x é o nome do amigo e y é o número de telefone desse amigo. Ou
//“Amigo não encontrado”
//Caso o amigo não esteja cadastrado.