package org.example

class Quadrado(
    cor: String,
    espressura: Int,
    var lado: Double
) : Figura(
    cor, espressura
) {
    override fun calculaArea(): Double {
        return lado * lado
    }

    override fun toString(): String {
        return super.toString() + "\nLado: $lado"
    }
}
/*
Obs: área do quadrado = lado * lado
 */