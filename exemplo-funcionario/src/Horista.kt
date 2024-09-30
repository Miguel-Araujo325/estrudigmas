class Horista(
    cpf: String,
    nome: String,
    var qtdHora: Int,
    var valorHora: Double
) : Funcionario(cpf, nome) {
    override fun calcSalario(): Double {
        return qtdHora * valorHora
    }

    override fun toString(): String {
        return super.toString() + ", salario = ${calcSalario()}"
    }
}