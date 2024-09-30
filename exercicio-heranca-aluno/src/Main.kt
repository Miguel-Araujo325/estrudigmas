fun main() {
    var aluno = Aluno("pedro", 5.0, 8.6)
    var alunoPos = AlunoPosGraduacao("valquiria", 10.0, 7.0, 9.0)
    var faculdade = Faculdade("sptecho", mutableListOf())

    faculdade.matricularAluno(aluno)
    faculdade.matricularAluno(alunoPos)

    faculdade.exibirAlunos()
    faculdade.exibirAlunosPosGraduacao()
    faculdade.exibirSomaDasMedias()
    println(faculdade.getQuantidadeAlunos())
    println(faculdade.getQuantidadeAlunosPosGraduacao())
    println(faculdade.exibirAlunosAbaixoDaMedia())
}