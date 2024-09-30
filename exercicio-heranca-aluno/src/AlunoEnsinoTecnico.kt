class AlunoEnsinoTecnico(
    nome: String,
    nota1: Double,
    nota2: Double,
    var curso: String
) : Aluno(nome, nota1, nota2) {
    fun exibirCursoAluno(): Unit {
        println(curso)
    }

    override fun toString(): String {
        return """
            Nome: $nome
            Nota 1: $nota1
            Nota 2: $nota2
            Curso: $curso
        """.trimIndent()
    }
}