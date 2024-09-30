package org.example

abstract class Figura(
    var cor: String,
    var espressura: Int
) {
    abstract fun calculaArea(): Double

    override fun toString(): String {
        return """
            Figura
            Área: ${calculaArea()}
            Cor: $cor
            Espressura: $espressura
        """.trimIndent()
    }
}
/*
a) Criar a classe abstrata Figura, que representa uma figura geométrica. Esta classe pode
ter atributos como cor, espessura do contorno. Providencie também o construtor e o
método toString(), que retorna uma String com os valores dos atributos.
b) Essa classe também deve ter a declaração de um método abstrato calculaArea( ), que
retorna um valor Double
 */