fun main() {

    // 6- Crie uma lista imutável com pelo menos 5 objetos Paciente.
    val paciente = listOf(
        Paciente(11, "Ana Teixeira", false, "Dor de cabeça", 30, 56.0),
        Paciente(12, "João Silva", true, "Febre", 25, 70.0),
        Paciente(13, "Maria Santos", false, "Dor de garganta", 40, 65.0),
        Paciente(14, "José Souza", true, "Dor de cabeça", 50, 80.0),
        Paciente(15, "Pedro Oliveira", false, "Febre", 20, 75.0)
    )
    // De forma funcional e sem utilizar variáveis conclua os passos a seguir...

    // 7- Filtre a lista do passo 6 para conter apenas pacientes maiores de 18 anos e exiba cada item da lista
    // em uma linha separada.
    paciente.filter { it.idade > 18 }.forEach { println(it) }
    // 8- Exiba a soma dos pesos de todos os pacientes.
    println(paciente.map { it.peso }.reduce { acc, valor -> acc + valor })
    // 9- Exiba a soma das idades apenas dos pacientes prioritários.
    println(paciente.filter { it.prioritario }.map { it.idade }.reduce { acc, valor -> acc + valor })
}
