package org.example

class AlunoFundamental(
    ra: Int,
    nome: String,
    nota1: Double,
    nota2: Double,
    private var nota3: Double,
    private var nota4: Double
) : Aluno(ra,  nome, nota1, nota2) {

    public fun getNota3(): Double{
        return nota3
    }

    public fun setNota3(nota1: Double){
        this.nota3 = nota1
    }

    public fun getNota4(): Double{
        return nota4
    }

    public fun setNota4(nota2: Double){
        this.nota4 = nota2
    }

    override fun calculaMedia(): Double {
        return (nota3 + nota4) / 4
    }

    override fun toString(): String {
        return super.toString() + "\nNota 3: $nota3 \nNota 4: $nota4 \nMedia: ${calculaMedia()}"
    }
}

/*
Criar as classes herdeiras (concretas) de Aluno: AlunoFundamental, AlunoGraduacao,
AlunoPos, com seus atributos.

Essas classes deverão conter a implementação do método calculaMedia( ), e que deverá
calcular e retornar a média do aluno (esse método é aquele que foi definido como abstrato na
classe Aluno).

Essas classes deverão ter também o método toString() que retorna uma String contendo os
valores de seus atributos e o valor da sua média.

Classe AlunoFundamental – representa um aluno do Ensino Fundamental
Sua média é calculada como sendo a média aritmética das suas notas nos 4 bimestres
(nota1, nota2, nota3, nota4). Soma todas as notas e divide por 4.
Não é necessário ter o atributo media.
Deve ter o construtor que recebe os valores de seus atributos e os inicializa. Esse
construtor chama o construtor da superclasse (classe mãe) para inicializar o ra e o nome.
 */