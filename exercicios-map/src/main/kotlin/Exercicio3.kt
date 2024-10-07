fun main() {
    val mapSorvete = mutableMapOf<String, Int>()

    while (true) {
        println("Digite o sabor do sorvete")
        val sabor = readln()
        if (sabor == "0") {
            break
        }
        if (mapSorvete.containsKey(sabor)) {
            mapSorvete[sabor] = mapSorvete[sabor]!! + 1
        } else {
            mapSorvete[sabor] = 1
        }
    }

    mapSorvete.forEach { (sabor, votos) ->
        println("$sabor: $votos votos")
    }
}
/*
Escreva um programa que utilize um Map para contabilizar os votos do sabor preferido de
sorvete de um grupo de amigos.
Leia diversos sabores até que o usuário digite “0” para encerrar o programa.
Ao final exiba quantos votos cada sabor obteve:
Saída:
Flocos: 2
Napolitano: 2
Chocolate: 1
 */