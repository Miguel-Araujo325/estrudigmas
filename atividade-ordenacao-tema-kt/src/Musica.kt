class Musica(
    var id: Int,
    var nome: String,
    var duracao: Double,
    var anoLancamento: Int,
    var genero: String,
    var artista: String,
    var album: String
) {
    override fun toString(): String {
        return "Musica(id=$id, nome='$nome', duracao=$duracao, anoLancamento=$anoLancamento, genero='$genero', artista='$artista', album='$album')"
    }
}
/*
 no total, 7 atributos:
- um atributo inteiro id
- um atributo do tipo String
- um atributo do tipo Double
- mais um outro atributo do tipo inteiro
- pelo menos mais 3 atributos, do tipo que preferir
 */