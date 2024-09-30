package produtora

fun main() {
    val produtora = Produtora(nome = "Cine Mark", vagas = 3)

    val ator1 = Ator(nome = "miguelindo", qtdHorasTrabalhadas = 80, valorHoraTrabalhada = 100.0)
    val ator2 = Ator(nome = "miguelado", qtdHorasTrabalhadas = 90, valorHoraTrabalhada = 120.0)
    val protagonista = Protagonista(nome = "miguers", qtdHorasTrabalhadas = 100, valorHoraTrabalhada = 150.0, valorHoraTrabalhasProtagonista = 500.0, qtdHorasTrabalhadasProtagonista = 120)

    produtora.contratar(ator1)
    produtora.contratar(ator2)
    produtora.contratar(protagonista)

    println("Existe 'migueguegue'? ${produtora.existePorNome("migueguegue")}")
    println("Existe 'miguers'? ${produtora.existePorNome("miguers")}")

    produtora.buscarAtorPorNome("miguers")

    println("Quantidade total de atores: ${produtora.getQuantidadeAtores()}")
    println("Quantidade de protagonistas: ${produtora.getQuantidadeProtagonista()}")

    println("Total de salários: R$${produtora.getTotalSalarios()}")

    println(produtora.toString())
}
