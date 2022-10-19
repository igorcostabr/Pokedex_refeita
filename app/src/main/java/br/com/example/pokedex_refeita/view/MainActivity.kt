package br.com.example.pokedex_refeita.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.example.pokedex_refeita.R
import br.com.example.pokedex_refeita.api.PokemonRepository
import br.com.example.pokedex_refeita.domain.Pokemon
import br.com.example.pokedex_refeita.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val charmander = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",
            4,
            "Charmander",
            listOf(PokemonType("Fire"))
        )
        val pokemons = listOf(charmander, charmander, charmander, charmander)

        val pokemonsApi = PokemonRepository.listPokemons()

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}