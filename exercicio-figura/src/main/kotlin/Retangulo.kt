package org.example

class Retangulo(
    cor: String,
    espressura: Int,
    var lado: Double,
    var altura: Double
) : Figura(
    cor, espressura
) {
    override fun calculaArea(): Double {
        return lado * altura
    }

    override fun toString(): String {
        return super.toString() + "\nLado: $lado\nAltura: $altura"
    }
}
/*
área do retângulo = base * altura
 */