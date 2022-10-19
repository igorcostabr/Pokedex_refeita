package br.com.example.pokedex_refeita.api.model

import br.com.example.pokedex_refeita.domain.PokemonType

data class PokemonsApiResult (
    val count: Int,
    val next: String?,
    val previous: String,
    val results: List<PokemonResult>
)

data class PokemonResult(
    val name: String,
    val url: String

)

data class PokemonApiResult(
    val id: Int,
    val name: String,
    val types: PokemonTypeSlot


)

data class PokemonTypeSlot (
    val slot: Int,
    val type: PokemonType
        )
