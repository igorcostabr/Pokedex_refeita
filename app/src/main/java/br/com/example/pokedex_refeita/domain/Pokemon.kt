package br.com.example.pokedex_refeita.domain

data class Pokemon (
    val imageUrl: String,
    val number: Int,
    val name: String,
    val types: List<PokemonType>
        )

