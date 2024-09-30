fun main() {
    var vetorMusica = arrayOf(
        Musica(1, "Hush", 3.5, 2018, "Indie Pop", "The Marías", "Superclean Vol. II"),
        Musica(2, "Clueless", 3.2, 2019, "Indie Pop", "The Marías", "Cinema"),
        Musica(3, "Boy With Luv", 3.7, 2019, "K-Pop", "BTS", "Map of the Soul: Persona"),
        Musica(4, "Dynamite", 3.8, 2020, "K-Pop", "BTS", "Dynamite"),
        Musica(5, "Lovers Rock", 3.3, 2020, "Indie Pop", "TV Girl", "French Exit"),
        Musica(6, "Birds Don’t Sing", 3.6, 2014, "Indie Pop", "TV Girl", "French Exit"),
        Musica(7, "Fake Love", 3.9, 2018, "K-Pop", "BTS", "Love Yourself: Tear"),
        Musica(8, "I Don't Know You", 3.32, 2017, "Indie Pop", "The Marías", "Superclean Vol. I")
    )

    for (i in vetorMusica) {
        println(i.nome)
    }

    println("============= APÓS ORDENAÇÃO =============")

    bubbleSort(vetorMusica)

    for (i in vetorMusica) {
        println(i.nome)
    }

    println("============= PESQUISA BINÁRIA =============")
    println(if (pesquisaBinaria(vetorMusica, "Birds Don’t Sing") != -1) "Encontrou" else "Não encontrou")

    println("============= INDICE NÃO EXISTENTE =============")
    println(if (pesquisaBinaria(vetorMusica, "Superclean") != -1) "Encontrou" else "Não encontrou")

    println("============= ARRAY INVERTIDA =============")
    var vetorMusica2 = arrayOf(
        Musica(1, "Hush", 3.5, 2018, "Indie Pop", "The Marías", "Superclean Vol. II"),
        Musica(2, "Clueless", 3.2, 2019, "Indie Pop", "The Marías", "Cinema"),
        Musica(3, "Boy With Luv", 3.7, 2019, "K-Pop", "BTS", "Map of the Soul: Persona"),
        Musica(4, "Dynamite", 3.8, 2020, "K-Pop", "BTS", "Dynamite"),
        Musica(5, "Lovers Rock", 3.3, 2020, "Indie Pop", "TV Girl", "French Exit"),
        Musica(6, "Birds Don’t Sing", 3.6, 2014, "Indie Pop", "TV Girl", "French Exit"),
        Musica(7, "Fake Love", 3.9, 2018, "K-Pop", "BTS", "Love Yourself: Tear"),
        Musica(8, "I Don't Know You", 3.32, 2017, "Indie Pop", "The Marías", "Superclean Vol. I")
    )

    for (i in vetorMusica) {
        println(i.nome)
    }

    println("============= APÓS ORDENAÇÃO =============")

    bubbleSortInvertido(vetorMusica)

    for (i in vetorMusica) {
        println(i.nome)
    }

    println("============= PESQUISA BINÁRIA =============")
    println(if (pesquisaBinariaInvertida(vetorMusica2, "Birds Don’t Sing") != -1) "Encontrou" else "Não encontrou")

    println("============= INDICE NÃO EXISTENTE =============")
    println(if (pesquisaBinariaInvertida(vetorMusica2, "Superclean") != -1) "Encontrou" else "Não encontrou")

}

//ordenando nome
fun bubbleSort(v: Array<Musica>) {
    for (i in 0..<v.size - 1) {
        for (j in 0..<v.size - i - 1) {
            if (v[j].nome > v[j + 1].nome) {
                val aux = v[j]
                v[j] = v[j + 1]
                v[j + 1] = aux
            }
        }
    }
}

//Invertido
fun bubbleSortInvertido(v: Array<Musica>) {
    for (i in 0..<v.size - 1) {
        for (j in 0..<v.size - i - 1) {
            if (v[j].nome < v[j + 1].nome) {
                val aux = v[j]
                v[j] = v[j + 1]
                v[j + 1] = aux
            }
        }
    }
}

fun pesquisaBinaria(v: Array<Musica>, x: String): Int {
    var indinf = 0
    var indsup = v.size - 1
    var meio: Int

    while (indinf <= indsup) {
        meio = (indinf + indsup) / 2
        if (v[meio].nome == x) {
            return meio
        } else if (x < v[meio].nome) {
            indsup = meio - 1
        } else {
            indinf = meio + 1
        }
    }
    return -1
}

fun pesquisaBinariaInvertida(v: Array<Musica>, x: String): Int {
    var indinf = 0
    var indsup = v.size - 1
    var meio: Int

    while (indinf <= indsup) {
        meio = (indinf + indsup) / 2
        if (v[meio].nome == x) {
            return meio
        } else if (x < v[meio].nome) {
            indinf = meio + 1
        } else {
            indsup = meio - 1
        }
    }
    return -1
}

/*
Se quiser se desafiar, implemente a ordenação em ordem decrescente e não em ordem crescente, como foi feita em aula!

Testar os algoritmos, testar a pesquisa binária com valor que existe e valor que não existe.
 */