package org.example

class ControleBonus {
    private var funcionarioBonus: MutableList<IBonus> = mutableListOf()

    fun calculaTotalBonus(): Double {
        var totalBonus = 0.0
        for (funcionario in funcionarioBonus) {
            totalBonus += funcionario.getBonus()
        }
        return totalBonus
    }

    fun adicionarFuncionario(funcionario: IBonus) {
        funcionarioBonus.add(funcionario)
    }

    fun exibirFuncionarios() {
        for (funcionario in funcionarioBonus) {
            println(funcionario.toString())
        }
    }
}