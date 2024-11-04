package org.example

class Info(
    val ra: String,
    val nome: String
) {
    override fun toString(): String {
        return "Info(ra=$ra, nome='$nome')"
    }
}

/*
1) Classe Info – essa classe tem os atributos ra e nome – e será usada para quando for executar uma operação de deletar no Repositorio, para poder desfazer essa operação futuramente.
 */