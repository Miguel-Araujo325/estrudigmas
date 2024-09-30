package org.example

class Exercicio7 : IMain {
    override fun main() {
        val diasMeses = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        println("Digite o dia")
        val dia = readln().toInt()

        println("Digite o mês")
        val mes = readln().toInt()

        var soma = dia

        for (i in 0 until mes - 1) {
            soma += diasMeses[i]
        }

        println("O dia $dia/$mes corresponde ao dia $soma do ano")
    }
}
//Exemplo:
//O dia 18/1 corresponde ao dia 18 do ano.
//O dia 23/2 corresponde ao dia 54 do ano. (31 dias de janeiro + 23 dias de fevereiro)
//O dia 5/3 corresponde ao dia 64 do ano. (31 dias de janeiro + 28 dias de fevereiro + 5 dias de março).
//
//Dica:
//Utilize um vetor contendo o número de dias de cada mês do ano