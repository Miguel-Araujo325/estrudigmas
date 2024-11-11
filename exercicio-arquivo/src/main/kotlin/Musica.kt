package org.example

class Musica(
    val id: Int,
    var nome: String,
    var autor: String,
    var duracao: Double,
    var anoLancamento: Int,
    var genero: String,
    var album: String,
    var gravadora: String
) {
    override fun toString(): String {
        return "Musica(id=$id, nome='$nome', autor='$autor', duracao=$duracao, anoLancamento=$anoLancamento, genero='$genero', album='$album', gravadora='$gravadora')"
    }
}

/*
- um atributo inteiro id
- um atributo do tipo String
- um atributo do tipo Double
- mais um outro atributo do tipo inteiro
- pelo menos mais 3 atributos, do tipo que preferir
 */