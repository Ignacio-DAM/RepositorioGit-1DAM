package com.example.pokedex.servicio;

import com.example.pokedex.dominio.Pokemon;
import com.example.pokedex.repositorio.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }

    // GET ALL
    public List<Pokemon> getAll() {
        return repository.findAll();
    }

    // GET BY ID
    public Optional<Pokemon> getById(Long id) {
        return repository.findById(id);
    }

    // CREATE
    public Pokemon save(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    // UPDATE
    public Pokemon update(Long id, Pokemon nuevoPokemon) {

        Pokemon pokemon = repository.findById(id).orElseThrow();

        pokemon.setNombre(nuevoPokemon.getNombre());
        pokemon.setTipo(nuevoPokemon.getTipo());
        pokemon.setNivel(nuevoPokemon.getNivel());

        return repository.save(pokemon);
    }

    // DELETE
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
