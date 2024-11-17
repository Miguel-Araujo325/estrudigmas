package org.example

class GerenciadorMusica {
    private val musicas = mutableMapOf<Int, Musica>()
    private var proximoId = 100

    fun adicionarMusica() {
        println("Digite o título da música:")
        val titulo = readLine() ?: ""
        println("Digite o nome do artista:")
        val artista = readLine() ?: ""
        println("Digite a duração da música em minutos:")
        val duracao = readLine()?.toIntOrNull() ?: 0

        val novaMusica = Musica(titulo, artista, duracao)
        musicas[proximoId] = novaMusica
        println("Música adicionada com ID: $proximoId")
        proximoId++
    }

    fun removerMusica() {
        println("Digite o ID da música a ser removida:")
        val id = readLine()?.toIntOrNull()

        if (id != null && musicas.containsKey(id)) {
            musicas.remove(id)
            println("Música com ID $id removida.")
        } else {
            println("ID não encontrado.")
        }
    }

    fun removerUltimaMusica() {
        if (musicas.isNotEmpty()) {
            val ultimoId = musicas.keys.maxOrNull()
            if (ultimoId != null) {
                musicas.remove(ultimoId)
                println("Última música (ID $ultimoId) removida.")
            }
        } else {
            println("Nenhuma música cadastrada.")
        }
    }

    fun exibirMusicas() {
        if (musicas.isEmpty()) {
            println("Nenhuma música cadastrada.")
        } else {
            println("Músicas cadastradas:")
            musicas.forEach { (id, musica) ->
                println("ID: $id | Título: ${musica.titulo} | Artista: ${musica.artista} | Duração: ${musica.duracao} minutos")
            }
        }
    }

    fun buscarMusica() {
        println("Digite o ID da música que deseja buscar:")
        val id = readLine()?.toIntOrNull()

        if (id != null && musicas.containsKey(id)) {
            val musica = musicas[id]
            println("Música encontrada: Título: ${musica?.titulo} | Artista: ${musica?.artista} | Duração: ${musica?.duracao} minutos")
        } else {
            println("Chave não encontrada.")
        }
    }

    fun atualizarMusica() {
        println("Digite o ID da música que deseja atualizar:")
        val id = readLine()?.toIntOrNull()

        if (id != null && musicas.containsKey(id)) {
            val musica = musicas[id]
            println("Digite o novo título da música:")
            val novoTitulo = readLine() ?: ""
            musica?.titulo = novoTitulo
            println("Música atualizada com sucesso!")
        } else {
            println("ID não encontrado.")
        }
    }

    fun gerarRelatorio() {
        if (musicas.isNotEmpty()) {
            val duracaoTotal = musicas.values.sumOf { it.duracao }
            val duracaoMedia = duracaoTotal.toDouble() / musicas.size
            println("Duração total das músicas: $duracaoTotal minutos")
            println("Duração média das músicas: %.2f minutos".format(duracaoMedia))
        } else {
            println("Nenhuma música cadastrada.")
        }
    }
}
/*
Crie uma classe GerenciadorTema que terá como um atributo um map, em que a chave  é um inteiro (id) e o valor é um objeto da sua classe tema.

Nessa classe GerenciadorTema, deverá haver um método para atender cada uma das opções do menu do main (opções de 1 a 7).

Opção 1 deve inserir um novo item (objeto da classe tema) na lista, com sua chave sendo o atributo id. Deve solicitar que o usuário digite os valores dos atributos do item. Se preferir, seu programa pode atualizar o id de forma automática, sem pedir que o usuário digite o valor do id.
Opção 2 deve remover um item pela chave. Solicita ao usuário que digite a chave do valor a ser removido.
Opção 3 deve remover o último item que foi inserido.
Opção 4 deve exibir todos os itens cadastrados no map.
Opção 5 deve exibir um item pela chave. Solicita que o usuário digite a chave do valor a ser exibido. Se a chave não existir, deve exibir "Chave não encontrada".
Opção 6 deve atualizar o valor do atributo de algum item (sem ser o id). Pode definir qual atributo será possível alterar. Deve solicitar que o usua´rio digite o valor da chave e o novo valor do atributo.
Opção 7 deve considerar algum atributo numérico da classe tema, sem ser o id, e realizar uma conta matemática (soma ou média), usando todos os itens cadastrados no map, e exibir o resultado ao usuário.
Cada opção no menu deve ser um método separado.

Após cada uma das operações, uma mensagem deve ser exibida ao usuário, mostrando o que foi feito.
 */