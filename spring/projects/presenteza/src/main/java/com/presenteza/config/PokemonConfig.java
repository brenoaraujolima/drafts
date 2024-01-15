package com.presenteza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.presenteza.pokemon.FirePokemon;
import com.presenteza.pokemon.GrassPokemon;
import com.presenteza.pokemon.PokemonStarters;
import com.presenteza.pokemon.WaterPokemon;
import com.presenteza.pokemon.impl.Bulbasaur;
import com.presenteza.pokemon.impl.Charmander;
import com.presenteza.pokemon.impl.Chikorita;
import com.presenteza.pokemon.impl.Cyndaquil;
import com.presenteza.pokemon.impl.PokemonStartersImpl;
import com.presenteza.pokemon.impl.Squirtle;
import com.presenteza.pokemon.impl.Totodile;

@Configuration
public class PokemonConfig {

	@Bean
	public FirePokemon firePokemon() {
		return new Cyndaquil();
	}

	@Bean
	public WaterPokemon waterPokemon() {
		return new Totodile();
	}

	@Bean
	public GrassPokemon grassPokemon() {
		return new Chikorita();
	}

	@Bean
	public PokemonStarters pokemonStarters(FirePokemon firePokemon, WaterPokemon waterPokemon, GrassPokemon grassPokemon) {
		return new PokemonStartersImpl(firePokemon, waterPokemon, grassPokemon);
	}
}
