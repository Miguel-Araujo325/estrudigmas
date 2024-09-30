package org.example

class Escola(
    private var nome: String
) {
    var alunos = mutableListOf<Aluno>()

    fun getNome(): String {
        return nome
    }

    fun setNome(nome: String){
        this.nome = nome
    }

    fun adicionaAluno(aluno: Aluno){
        alunos.add(aluno)
    }

    fun exibeTodos(){
        for (a in alunos){
            println(a.toString())
        }
    }

    fun exibeAlunoGraduacao(){
        for (a in alunos){
            if(a is AlunoGraduacao){
               println(a.toString())
            }
        }
    }

    fun exibeAprovados(){
        for (a in alunos){
            if(a.calculaMedia() > 6){
                println(a.toString())
            }
        }
    }
/*
    fun buscaAluno(ra: Int){
        var aluno = 0
        for (a in alunos){
            if(a.getRa() == ra){
                println(a.toString())
                aluno++
            }
        }
        if(aluno == 0){
            println("Aluno não encontrado")
        }
    }
    */

}

/*
Criar a classe Escola, conforme ilustrado no diagrama de classes.
Essa classe tem 2 atributos: o nome da escola e uma lista de objetos Aluno (List)
O construtor dessa classe recebe o nome da escola e inicializa o atributo nome.
O construtor também é responsável por criar o ArrayList de Aluno, correspondente ao
atributo lista.
Implemente os métodos:
- adicionaAluno (Aluno a) – tipo void – recebe um objeto do tipo Aluno e adiciona esse objeto
à lista
- exibeTodos () – tipo void – exibe os dados de todos os alunos que estão na lista
- exibeAlunoGraduacao() – tipo void – exibe os dados somente dos alunos de graduação
- exibeAprovados() – tipo void – exibe os dados de todos os alunos aprovados que estão na
lista (média maior ou igual a 6)
- buscaAluno(Integer ra) – tipo void – recebe um valor de ra e verifica se existe aluno
cadastrado com esse ra. Se existir, exibe os dados desse aluno. Se não existir, exibe uma
mensagem de “Aluno não encontrado”. Dica: neste método, você terá que utilizar o getRa().
 */