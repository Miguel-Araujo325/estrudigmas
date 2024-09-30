package org.example

class Imagem {
    val figuras: MutableList<Figura> = mutableListOf()

    fun adicionaFigura(f: Figura) {
        figuras.add(f)
    }

    fun exibeFiguras() {
        for (f in figuras) {
            println(f.toString() + "\n")
        }
    }

    fun exibeSomaArea() {
        val soma = figuras.sumOf { it.calculaArea() }
        println("O total das áreas é $soma")
    }

    fun exibeFiguraAreaMaior20() {
        figuras.forEach { figura ->
            if (figura.calculaArea() > 20.0) {
                println(figura.toString() + "\n")
            }
        }
    }

    fun exibeQuadrado() {
        figuras.forEach { figura ->
            if (figura is Quadrado) {
                println(figura.toString() + "\n")
            }
        }
    }
}

/*
Criar uma classe Imagem, que tem como atributo uma lista de objetos Figura.
Essa classe deve ter os métodos:
void adicionaFigura(Figura f)
Recebe um objeto Figura e acrescenta esse objeto à lista.
void exibeFiguras()
Percorre a lista de Figuras e exibe as informações de cada objeto, incluindo a área da figura.
void exibeSomaArea()
Este método deve exibir a soma das áreas de todas as figuras que compõem a imagem.
void exibeFiguraAreaMaior20()
Este método deve exibir os dados de todas as figuras que compõem a imagem e que
possuam área maior do que 20.
void exibeQuadrado()
Este método deve exibir os dados de todas as figuras Quadrado que compõem a imagem.
 */