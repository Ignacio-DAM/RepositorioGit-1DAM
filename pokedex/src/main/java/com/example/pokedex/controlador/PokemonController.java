package com.example.pokedex.controlador;

import com.example.pokedex.dominio.Pokemon;
import com.example.pokedex.servicio.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    // GET ALL
    @GetMapping
    public List<Pokemon> getAll() {
        return service.getAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Pokemon getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    // CREATE
    @PostMapping
    public Pokemon create(@RequestBody Pokemon pokemon) {
        return service.save(pokemon);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Pokemon update(@PathVariable Long id,
                          @RequestBody Pokemon pokemon) {

        return service.update(id, pokemon);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
