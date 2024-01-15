package com.presenteza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.presenteza.pokemon.PokemonStarters;
import com.presenteza.pokemon.impl.PokemonStartersImpl;

@SpringBootApplication
public class PresentezaApplication implements CommandLineRunner {

	PokemonStarters pokemonStarters;

	PresentezaApplication(PokemonStarters pokemonStarters) {
		this.pokemonStarters = pokemonStarters;
	}

	public static void main(final String ...args) {
		SpringApplication.run(PresentezaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(pokemonStarters.print());
	}
}
