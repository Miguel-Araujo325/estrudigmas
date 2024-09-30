package consultoria

fun main() {
    val consultoria = Consultoria(nome = "consulta as rias", vagas = 5)

    val dev1 = Desenvolvedor(nome = "mount", qtdHorasTrabalhadas = 160, valorHoraTrabalhada = 50.0)
    val dev2 = Desenvolvedor(nome = "gabriel", qtdHorasTrabalhadas = 170, valorHoraTrabalhada = 55.0)
    val dev3 = DesenvolvedorMobile(nome = "brino", qtdHorasTrabalhadas = 150, valorHoraTrabalhada = 45.0,
        qtdHorasTrabalhadasMobile = 20, valorHoraTrabalhadaMobile = 60.0)

    consultoria.contratar(dev1)
    consultoria.contratar(dev2)
    consultoria.contratar(dev3)

    println("Existe 'miguel'? ${consultoria.existePorNome("miguel")}")
    println("Existe 'mount'? ${consultoria.existePorNome("mount")}")

    consultoria.buscarDesenvolvedorPorNome("Bob")

    println("Quantidade total de desenvolvedores: ${consultoria.getQuantidadeDesenvolvedores()}")
    println("Quantidade de desenvolvedores mobile: ${consultoria.getQuantidadeDesenvolvedoresMobile()}")

    println("Total salario: R$${consultoria.getTotalSalarios()}")

    println(consultoria.toString())
}
