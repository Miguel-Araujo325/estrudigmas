package org.example

fun main() {
    val quadrado = Quadrado("verde", 4, 4.0)
    val retangulo = Retangulo("verde-agua", 5, 4.0, 8.0)
    val triangulo = Triangulo("verde-azul", 4, 4.0, 4.0)
    val circulo = Circulo("verde-pantano", 5, 4.0)

    val imagem = Imagem()

    imagem.adicionaFigura(quadrado)
    imagem.adicionaFigura(retangulo)
    imagem.adicionaFigura(triangulo)
    imagem.adicionaFigura(circulo)

    println("Exibindo figuras")
    imagem.exibeFiguras()

    imagem.exibeSomaArea()

    println("Exibindo figura com area maior q 20")
    imagem.exibeFiguraAreaMaior20()


    println("Exibindo quadrados")
    imagem.exibeQuadrado()
}


