package org.example

class Circulo(
    cor: String,
    espressura: Int,
    var raio: Double
) : Figura(
    cor, espressura
) {
    override fun calculaArea(): Double {
        return Math.PI * raio * raio
    }

    override fun toString(): String {
        return super.toString() + "\nRaio: $raio"
    }
}
/*
área do círculo =  * raio * raio
 */