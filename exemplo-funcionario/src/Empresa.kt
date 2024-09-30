class Empresa {
    val funcionarios = mutableListOf<Funcionario>()

    fun adicionaFunc(f: Funcionario){
        funcionarios.add(f)
    }

    fun exibeTodos(){
        for(funcionarios in funcionarios){
            println(funcionarios)
        }
        println()
    }

    fun exibeTotalSalario(){
        var total = 0.0
        for(funcionarios in funcionarios){
            total += funcionarios.calcSalario()
        }
        println("Total de salarios é: R$$total")
    }

    // Fizemos engenheiros, pois não fizemos horistas na aula
    fun exibeEngenheiros(){
        for(funcionarios in funcionarios){
            if(funcionarios is Engenheiro){
                println(funcionarios)
            }
        }
        println()
    }
}