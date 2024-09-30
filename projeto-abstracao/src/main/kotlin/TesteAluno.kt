package org.example

fun main() {
    var aluno1 = AlunoFundamental(1, "miguelito", 10.0, 5.0, 8.0, 10.0)
    var aluno2 = AlunoGraduacao(2, "miguelite", 10.0, 5.0)
    var aluno3 = AlunoPos(3, "miguelitu", 10.0, 5.0, 8.0)

    var alunos = arrayOf(aluno1, aluno2, aluno3)

    for (i in 0..2) {
        println(alunos[i].toString())
        println()
    }

    val escola = Escola("sptecho")

    for (i in 0..2) {
        escola.adicionaAluno(alunos[i])
    }

    escola.exibeTodos()
    escola.exibeAprovados()
    escola.exibeAlunoGraduacao()
   // escola.buscaAluno(1)
}

/*
Criar a classe TesteAluno, que tem o método main.
Crie objetos das classes AlunoFundamental, AlunoGraduacao, AlunoPos e atribua valores para
os seus atributos e exiba os dados dos objetos, inclusive a média. Verifique se a média está
sendo calculada de forma correta.
 */