package com.presenteza.pokemon.impl;

import com.presenteza.pokemon.FirePokemon;
import com.presenteza.pokemon.GrassPokemon;
import com.presenteza.pokemon.PokemonStarters;
import com.presenteza.pokemon.WaterPokemon;

public class PokemonStartersImpl implements PokemonStarters {

	private FirePokemon firePokemon;
	private WaterPokemon waterPokemon;
	private GrassPokemon grassPokemon;

	public PokemonStartersImpl(FirePokemon firePokemon, WaterPokemon waterPokemon, GrassPokemon grassPokemon) {
		this.firePokemon = firePokemon;
		this.waterPokemon = waterPokemon;
		this.grassPokemon = grassPokemon;
	}

	@Override
	public String print() {
		return String.join(",", firePokemon.print(), waterPokemon.print(), grassPokemon.print());
	}
}
