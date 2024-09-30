package org.example

fun main() {
    val secretaria = Secretaria(40.0, 10.0, "111.222.333-44", "Ana", 20.0)
    println(secretaria.calcularSalario())
    println(secretaria.toString())

    val controleBonus = ControleBonus()
    val coordenador = Coordenador(20.0, 2, "123.456.789-00", "João", 100.0)

    println(coordenador.calcularSalario())
    println(coordenador.getBonus())
    println(coordenador.toString())

    val professor = Professor(10, "987.654.321-00", "Maria", 50.0)
    println(professor.calcularSalario())
    println(professor.getBonus())
    println(professor.toString())


    controleBonus.adicionarFuncionario(coordenador)
    controleBonus.adicionarFuncionario(professor)
    controleBonus.exibirFuncionarios()
    println("Total de Bonus: ${controleBonus.calculaTotalBonus()}")
}