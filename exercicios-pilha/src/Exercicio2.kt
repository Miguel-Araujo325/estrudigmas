import java.util.Stack

fun main() {
    converterParaBinario(9);
    converterParaBinario(12);
    converterParaBinario(32);
}

fun converterParaBinario(decimal: Int) {
    var resto = Stack<Int>();
    var decimal = decimal;
    while (decimal > 0) {
        resto.push(decimal % 2);
        decimal /= 2;
    }

    while (!resto.isEmpty()) {
        print(resto.pop());
    }

    println()
}
/*
Conversão de decimal para binário. Implemente o método converterParaBinario, que
recebe um número inteiro em decimal e exibe o seu valor em binário. O método é Unit.


Utilize uma pilha para converter um número de decimal para binário.
Ex: Número 9 – representação em binário: 1001
Número 12 – representação em binário: 1100
Número 32 – representação em binário: 100000


Dica: para converter um número de decimal para binário, devemos dividi-lo
sucessivamente por 2, até que o quociente seja zero.
A representação em binário
corresponde aos restos de cada divisão, considerados na ordem inversa.
Assim, basta ir dividindo o número sucessivamente por 2, e ir empilhando os restos, até
que o quociente seja zero. Depois, enquanto a pilha não estiver vazia, desempilhe e
exiba o valor desempilhado.
 */