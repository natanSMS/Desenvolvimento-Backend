package com.example.ex01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {
	private static List <Pokemon> pokemons = new ArrayList<>();

	@PostMapping("/adicionar-pokemon")
	public static String adicionarPokemon(@RequestBody Pokemon pokemonX) {
		for(Pokemon pokemon : pokemons) {
			if(pokemon.getId() == pokemonX.getId()) {
				return "Pokemon já existente";
			}
		}
		pokemons.add(pokemonX);

		return "Pokemon novo adicionado";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);

		pokemons.add(new Pokemon(1, "Charmander"));
		pokemons.add(new Pokemon(2, "Squirtle"));
		pokemons.add(new Pokemon(3, "Bulbasaur"));
	}
}
