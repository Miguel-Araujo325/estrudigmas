package org.example

abstract class Aluno(
    protected var ra: Int,
    private var nome: String,
    private var nota1: Double,
    private var nota2: Double
) {
    /*
    public fun getRa(): Int{
        return ra
    }

    public fun setRa(ra: Int){
        this.ra = ra
    }

    public fun getNome(): String{
        return nome
    }

    public fun setNome(nome: String){
        this.nome = nome
    }

    public fun getNota1(): Double{
        return nota1
    }

    public fun setNota1(nota1: Double){
        this.nota1 = nota1
    }

    public fun getNota2(): Double{
        return nota2
    }

    public fun setNota2(nota2: Double){
        this.nota2 = nota2
    }
     */

    abstract fun calculaMedia(): Double

    override fun toString(): String {
        return """
            Aluno:
            Ra: $ra
            Nome: $nome
            Nota 1: $nota1
            Nota 2: $nota2
        """.trimIndent()
    }
}

/*
Criar a classe abstrata Aluno, que representa um aluno de uma instituição. Esta classe tem
os atributos ra (tipo Integer) e nome (tipo String). Esses atributos devem estar encapsulados.
Essa classe deve ter o construtor que recebe os valores de ra e nome e inicializa os atributos.
Essa classe deve ter a declaração de um método abstrato Double calculaMedia( ).
Essa classe também deve ter o método toString(),que devolve uma String contendo os dados
do Aluno. Esse método deve ser declarado com @Override.
 */