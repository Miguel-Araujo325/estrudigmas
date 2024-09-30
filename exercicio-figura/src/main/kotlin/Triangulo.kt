package org.example

class Triangulo(
    cor: String,
    espressura: Int,
    var lado: Double,
    var altura: Double
) : Figura(
    cor, espressura
) {
    override fun calculaArea(): Double {
        return (lado * altura) / 2
    }

    override fun toString(): String {
        return super.toString() + "\nLado: $lado\nAltura: $altura"
    }
}
/*
área do triângulo = base * altura / 2
 */