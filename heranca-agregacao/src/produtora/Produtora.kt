package produtora

class Produtora(
    var nome: String,
    var vagas: Int
) {
    val atores: MutableList<Ator> = arrayListOf();

    fun existePorNome(nome: String): Boolean{
        for(a in atores){
            if(nome == a.nome){
                return true;
            }
        }
        return false;
    }

    fun contratar(ator: Ator){
        if (atores.size == vagas){
            println("Sem vagas disponíveis!");
        } else{
            atores.add(ator);
        }
    }

    fun getQuantidadeAtores(): Int{
        return atores.size
    }

    fun getQuantidadeProtagonista(): Int{
        var protagonista: Int = 0;
        for(a in atores){
            if(a is Protagonista){
                protagonista++;
            }
        }
        return protagonista;
    }

    fun getTotalSalarios(): Double{
        var total = 0.0
        for(a in atores){
            total += a.getSalario()
        }
        return total
    }

    fun buscarAtorPorNome(nome: String): Unit?{
        for(a in atores){
            if(nome == a.nome){
                println(a.toString());
            }
        }
        return null;
    }

    override fun toString(): String {
        return """
            nome: $nome
            vagas: $vagas
            quantidade de atores: ${atores.size}
        """.trimIndent()
    }

}
/*
Crie uma classe chama Produtora
Atributos:
• nome
• vagas
Métodos:
• existePorNome(): recebe o nome de um ator e verifica se ele existe na
produtora, se encontrado retornar true, caso contrário retornar false
• contratar(): recebe um ator e adiciona na produtora, exiba a frase “Sem vagas
disponíveis!” caso as vagas estejam esgotadas.
• getQuantidadeAtores(): retorna um número inteiro coma quantidade de atores
na produtora
• getQuantidadeProtagonista(): retorna um número inteiro com a quantidade
de protagonistas na produtora
• getTotalSalarios(): retorna a soma dos salários de todos os atores
• buscarAtorPorNome(): recebe um nome e busca na lista de atores, caso não
encontrado retornar null
• toString(): exibir os valores dos atributos criados na classe, formato e com uso de
interpolação
 */