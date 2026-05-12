package com.example.pokedex.repositorio;

import com.example.pokedex.dominio.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
