package com.example.pokedex;
import com.example.pokedex.dominio.Pokemon;
import com.example.pokedex.repositorio.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PokemonDataLoader implements CommandLineRunner {

    private final PokemonRepository repository;

    public PokemonDataLoader(PokemonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        repository.save(new Pokemon("Pikachu", "Electrico", 25));
        repository.save(new Pokemon("Raichu", "Electrico", 40));
        repository.save(new Pokemon("Charmander", "Fuego", 12));
        repository.save(new Pokemon("Charmeleon", "Fuego", 25));
        repository.save(new Pokemon("Charizard", "Fuego", 50));
        repository.save(new Pokemon("Squirtle", "Agua", 10));
        repository.save(new Pokemon("Wartortle", "Agua", 20));
        repository.save(new Pokemon("Blastoise", "Agua", 45));
        repository.save(new Pokemon("Bulbasaur", "Planta", 15));
        repository.save(new Pokemon("Ivysaur", "Planta", 25));
        repository.save(new Pokemon("Venusaur", "Planta", 50));
        repository.save(new Pokemon("Pidgey", "Volador", 5));
        repository.save(new Pokemon("Rattata", "Normal", 4));
        repository.save(new Pokemon("Ekans", "Veneno", 18));
        repository.save(new Pokemon("Jigglypuff", "Hada", 22));
        repository.save(new Pokemon("Meowth", "Normal", 16));
        repository.save(new Pokemon("Psyduck", "Agua", 14));
        repository.save(new Pokemon("Machop", "Lucha", 19));
        repository.save(new Pokemon("Gastly", "Fantasma", 21));
        repository.save(new Pokemon("Snorlax", "Normal", 35));

        System.out.println("Se pudo");
    }
}
