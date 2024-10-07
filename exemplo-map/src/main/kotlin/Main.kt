package org.example

fun main() {
    var mapVazio = LinkedHashMap<String, String>();

    var mapConfiguracao = mutableMapOf("linguagem" to "kotlin", "versão" to "1.16.0", "ambiente" to "desenvolvimento");

    println(mapConfiguracao);

    println(mapConfiguracao["linguagem"]);

    mapConfiguracao["linguagem"] = "Java";
    println(mapConfiguracao["linguagem"]);

    mapConfiguracao["modo"] = "debug";
    println(mapConfiguracao);

    var ultimaChave = mapConfiguracao.keys.last();
    mapConfiguracao.remove(ultimaChave)

    println(mapConfiguracao)

    var lista = listOf(6, 5, 4, 3, 2, 1);
    var mapNumeros = lista.groupBy { numeroDaVez -> if (numeroDaVez % 2 == 0) "par" else "impar" };
    println(mapNumeros);

    println(mapConfiguracao.getOrElse("linguagem") { "Não encontrado" });
    println(mapConfiguracao.getOrElse("Software") { "Software não encontrado" });

    println("==== Exibindo os valores ====");
    for(valor in mapConfiguracao.values){
        println(valor);
    }

    println("==== Exibindo as chaves ====");
    for(chave in mapConfiguracao.keys){
        println(mapConfiguracao[chave]);
    }
}