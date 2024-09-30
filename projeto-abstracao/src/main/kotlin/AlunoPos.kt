package org.example

class AlunoPos (
    ra: Int,
    nome: String,
    nota1: Double,
    nota2: Double,
    private var notaMonografia: Double
) : Aluno(ra,  nome, nota1, nota2) {

    fun getNotaMonografia(): Double{
        return notaMonografia
    }

    fun setNotaMonografia(notaMonografia: Double){
        this.notaMonografia = notaMonografia
    }

    override fun calculaMedia(): Double {
        return (notaMonografia) / 3
    }

    override fun toString(): String {
        return super.toString() + "\nNota Monografia: $notaMonografia \nMedia: ${calculaMedia()}"
    }
}

/*
Classe AlunoPos – representa um aluno da Pós-graduação da Faculdade
Sua média é calculada como sendo a média aritmética das suas notas nos 2 bimestres,
mais a nota da monografia (nota1, nota2, notaMonografia). Soma as 3 notas e divide por 3.
Não é necessário ter o atributo media.
Deve ter o construtor que recebe os valores de seus atributos e os inicializa. Esse
construtor também chama o construtor da superclasse.
 */