package org.example

fun main() {
    println("Qual exercicio quer ver?")
    var exercicio = readLine()!!.toInt()

    when (exercicio) {
        1 -> {
            val ex1 = Exercicio1()
            println("EXERCÍCIO 1")
            ex1.main()
        }

        2 -> {
            val ex2 = Exercicio2()
            println("EXERCÍCIO 2")
            ex2.main()
        }

        3 -> {
            val ex3 = Exercicio3()
            println("EXERCÍCIO 3")
            ex3.main()
        }

        4 ->{
            val ex4 = Exercicio4()
            println("EXERCÍCIO 4")
            ex4.main()
        }

        5 -> {
            val ex5 = Exercicio5()
            println("EXERCÍCIO 5")
            ex5.main()
        }

        6 -> {
            val ex6 = Exercicio6()
            println("EXERCÍCIO 6")
            ex6.main()
        }

        7 ->{
            val ex7 = Exercicio7()
            println("EXERCÍCIO 7")
            ex7.main()
        }
    }
}