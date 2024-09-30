package consultoria

class Consultoria (
    var nome: String,
    var vagas: Int
){
    val desenvolvedores: MutableList<Desenvolvedor> = arrayListOf();

    fun existePorNome(nome: String): Boolean{
        for(d in desenvolvedores){
            if(nome == d.nome){
                return true;
            }
        }
        return false;
    }

    fun contratar(desenvolvedor: Desenvolvedor){
        if (desenvolvedores.size == vagas){
            println("Sem vagas disponíveis!");
        } else{
            desenvolvedores.add(desenvolvedor);
        }
    }

    fun getQuantidadeDesenvolvedores(): Int{
        return desenvolvedores.size;
    }

    fun getQuantidadeDesenvolvedoresMobile(): Int{
        var devMobile: Int = 0;
        for(d in desenvolvedores){
            if(d is DesenvolvedorMobile){
                devMobile++;
            }
        }
        return devMobile;
    }

    fun getTotalSalarios(): Double{
        var salarios: Double = 0.0;
        for(d in desenvolvedores){
            salarios += d.getSalario();
        }
        return salarios;
    }

    fun buscarDesenvolvedorPorNome(nome: String): Unit? {
        for(d in desenvolvedores){
            if(nome == d.nome){
                println(d.toString());
            }
        }
        return null;
    }

    override fun toString(): String {
        return """
            nome: $nome
            vagas: $vagas
            quantidade de desenvolvedores: ${desenvolvedores.size}
        """.trimIndent()
    }
}

/*
existePorNome(): recebe o nome de um desenvolvedor e verifica se ele existe na
consultoria, se encontrado retornar true, caso contrário retornar false
• contratar(): recebe um desenvolvedor e adiciona na consultoria, exiba a frase “Sem
vagas disponíveis!” caso as vagas estejam esgotadas.
• getQuantidadeDesenvolvedores(): retorna um número inteiro com a
quantidade de desenvolvedores na consultoria
• getQuantidadeDesenvolvedoresMobile(): retorna um número inteiro com a
quantidade de desenvolvedores mobile na consultoria
• getTotalSalarios(): retorna a soma dos salários de todos os desenvolvedores
• buscarDesenvolvedorPorNome(): recebe um nome e busca na lista de
desenvolvedores, caso não encontrado retornar null
• toString(): exibir os valores dos atributos criados na classe, formato e com uso de
interpolação.
 */