package org.example

fun main() {
    val v = arrayOf(5, 3, 2, 4, 7, 1, 0, 6);
    println("Antes da ordenação ${imprimirArray(v)}");
    println("Depois da ordenação ${imprimirArray(selectionSort(v))}");

    println()

    val v2 = arrayOf(5, 3, 2, 4, 7, 1, 0, 6);
    println("Antes da ordenação ${imprimirArray(v2)}");
    println("Depois da ordenação ${imprimirArray(selectionSortOtimizado(v2))}");

    println()

    val v3 = arrayOf(5, 3, 2, 4, 7, 1, 0, 6);
    println("Antes da ordenação ${imprimirArray(v3)}");
    println("Depois da ordenação ${imprimirArray(bubbleSort(v3))}");

    println()

    var indice = pesquisaBinaria(v3, 2)
    println(if (indice != -1) "valor no índice $indice" else "Valor não existe")

    println()

    indice = pesquisaBinaria(v3, 100)
    println(if (indice != -1) "valor no índice $indice" else "Valor não existe")
}

fun selectionSort(v: Array<Int>): Array<Int> {
    println("SELECTION SORT NÃO OTIMIZADO")
    // Selection Sort
    // Ele percorre o array várias vezes, a cada iteração ele encontra o menor elemento e coloca na primeira posição
    // Já que a troca do índice do ocorre dentro no 2° for o número de vezes que a o índice é modificado é muito alto
    // o que diminui a performance do algoritmo
    for (i in 0 until v.size) {
        for (j in i + 1 until v.size) {
            if (v[j] < v[i]) {
                val aux = v[j];
                v[j] = v[i];
                v[i] = aux;
            }
        }
    }

    return v;
}

fun selectionSortOtimizado(v: Array<Int>): Array<Int> {
    println("SELECTION SORT OTIMIZADO")
    // Selection Sort
    // Já que a troca ocorre depois da 2° intineiração, ele diminui o número de trocas na variaveis o que é melhor para a performance
    for (i in 0 until v.size) {
        var menorIndice = i;
        for (j in i + 1 until v.size) {
            if (v[j] < v[menorIndice]) {
                menorIndice = j;
            }
        }
        val aux = v[i];
        v[i] = v[menorIndice];
        v[menorIndice] = aux;
    }

    return v;
}

fun bubbleSort(v: Array<Int>): Array<Int> {
    println("BUBBLE SORT")
    // Bubble Sort sobe os valores mais altos como se fossem bolhas, e ordena a array pelo maior valor
    // Ele percorre o array várias vezes, a cada iteração ele encontra o maior elemento e coloca na última posição
    for (i in 0 until v.size) {
        for (j in 1 until v.size - i) {
            if (v[j - 1] > v[j]) {
                val aux = v[j];
                v[j] = v[j - 1];
                v[j - 1] = aux;
            }
        }
    }
    return v
}

fun imprimirArray(array: Array<Int>) {
    for (i in 0 until array.size) {
        print("${array[i]} ");
    }
}

fun pesquisaBinaria(v: Array<Int>, x: Int): Int {
    println("PESQUISA BINARIA DO VALOR $x")
    var inicio: Int = 0
    var fim: Int = v.size - 1;

    // Quando o inicio ultrapassar o fim da minha array significa q o valor não existe no vetor
    while (inicio <= fim) {
        // Calcula o meio de um vetor para comparar com o valor que quer encontrar
        var meio: Int = (inicio + fim) / 2

        // Se o valor for igual o meio, já retorna se não ele reatribui o inicio/fim dependendo do tamanho que quero encontrar para re-calcular o meio
        if(x == v[meio]){
            return  meio
        } else if(x > v[meio]){
            inicio = meio + 1
        } else{
            fim = meio - 1
        }
    }
    return -1
}