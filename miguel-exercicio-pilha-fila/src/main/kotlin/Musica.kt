package org.example

class Musica(
    val id: Int,
    var nome: String,
    var autor: String,
    var duracao: Double
) {
    override fun toString(): String {
        return "Musica(id=$id, nome='$nome', autor='$autor', duracao=$duracao)"
    }
}