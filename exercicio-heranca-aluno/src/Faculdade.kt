class Faculdade(
    var nome: String,
    var alunos: MutableList<Aluno>
) {
    fun matricularAluno(aluno: Aluno): Unit {
        alunos.add(aluno)
    }

    fun exibirAlunos(): Unit {
        for (alunosDaVez in alunos) {
            println(alunosDaVez.toString())
        }
        println()
    }

    fun exibirAlunosPosGraduacao(): Unit {
        for (alunosDaVez in alunos) {
            if (alunosDaVez is AlunoPosGraduacao) {
                println(alunosDaVez.toString())
            }
        }
        println()
    }

    fun exibirSomaDasMedias(): Unit {
        var soma = 0.0
        for (alunosDaVez in alunos) {
            soma += alunosDaVez.calcularMedia()
        }
        println("A soma das médias é " + soma)
    }

    fun buscarAlunoPorNome(nome: String): Unit {
        for (alunosDaVez in alunos) {
            if (alunosDaVez.equals(alunosDaVez.nome)) {
                println(alunosDaVez.toString())
            }
        }
    }

    fun getQuantidadeAlunos(): Int {
        return alunos.size
    }

    fun getQuantidadeAlunosPosGraduacao(): Int {
        var quantidadeAlunos = 0
        for (alunosDaVez in alunos) {
            if (alunosDaVez is AlunoPosGraduacao) {
                quantidadeAlunos++
            }
        }
        return quantidadeAlunos
    }

    fun exibirAlunosAbaixoDaMedia(): Int{
        var alunoAbaixoDaMedia: Int = 0
        for (alunosDaVez in alunos){
            if (alunosDaVez is AlunoPosGraduacao && alunosDaVez.calcularMedia() < 6){
                alunoAbaixoDaMedia++
            } else if (alunosDaVez.calcularMedia() < 5){
                alunoAbaixoDaMedia++
            }
        }
        return alunos.size
    }
}
/*
buscarAlunoPorNome(): Aluno
• getQuantidadeAlunos(): Int
• getQuantidadeAlunosPosGraduacao(): Int
• exibirAlunosAbaixoDaMedia() - Considere média 6 para alunos de pósgraduação e 5 para os demais alunos
*/