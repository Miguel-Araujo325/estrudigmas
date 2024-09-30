package org.example

class AlunoGraduacao (
    ra: Int,
    nome: String,
    nota1: Double,
    nota2: Double
) : Aluno(ra,  nome, nota1, nota2) {

    override fun calculaMedia(): Double {
        return (0.6)
    }

    override fun toString(): String {
        return super.toString() +
                "\nMedia: ${calculaMedia()}"
    }
}

/*
Classe AlunoGraduacao – representa um aluno da Graduação da Faculdade
Sua média é calculada como sendo a média ponderada da nota1 e da nota2, como é
calculado na Faculdade.
Ou seja, a média é nota1 * 0.4 + nota2 * 0.6
Não é necessário ter o atributo media.
Deve ter o construtor que recebe os valores de seus atributos e os inicializa. Esse
construtor também chama o construtor da superclasse.
 */