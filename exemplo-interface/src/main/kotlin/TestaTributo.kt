package org.example

fun main() {
    var alimento = Alimento(1, "Morangos Silvestres do Egito", 99.99, 5)
    var perfume = Perfume(2, "Body Splash Waffler da Virgina", 200.0, "Waffle / Morte")
    var servico = Servico("Decoração festa infantil", 200.0)

    val tributo = Tributo()

    tributo.adicionaTributavel(alimento)
    tributo.adicionaTributavel(perfume)
    tributo.adicionaTributavel(servico)

    println("Exibindo todos os tributos")
    tributo.exibeTodos()

    println("Exibindo o total dos tributos")
    println(tributo.calculaTotalTributo())
}
/*
Crie um objeto do tipo Alimento e inicialize seus atributos.
Crie um objeto do tipo Perfume e inicialize seus atributos.
Crie um objeto do tipo Servico e inicialize seus atributos.
Crie um objeto do tipo Tributo e adicione o alimento, o perfume e o servico criados à lista
de tributáveis.
(se preferir, crie mais objetos Alimento, Perfume e Servico e adicione-os à lista)
Chame o método exibeTodos() para exibir todos os itens armazenados na lista.
Chame o método calculaTotalImposto( ) e exiba qual é o valor total dos impostos dos itens
armazenados.
 */