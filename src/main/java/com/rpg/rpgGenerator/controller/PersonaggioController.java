package com.rpg.rpgGenerator.controller;

import com.rpg.rpgGenerator.entity.Personaggio;
import com.rpg.rpgGenerator.service.PersonaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personaggi")
public class PersonaggioController {

    @Autowired
    private PersonaggioService personaggioService;

    @GetMapping("/{id}")
    public Optional<Personaggio> getPersonaggioById(@PathVariable Long id) {
        return personaggioService.findById(id);
    }

    @GetMapping("/nome/{nomePersonaggio}")
    public Personaggio getPersonaggioByNome(@PathVariable String nomePersonaggio) {
        return personaggioService.findByNomePersonaggio(nomePersonaggio);
    }

    @GetMapping("/classe/{nomeClasse}")
    public List<Personaggio> getPersonaggiByClasse(@PathVariable String nomeClasse) {
        return personaggioService.findAllByClassePersonaggio(nomeClasse);
    }

    @PostMapping
    public Personaggio insertPersonaggio(@RequestBody Personaggio p) {
        return personaggioService.insertPersonaggio(p);
    }

    @PutMapping("/{id}")
    public Personaggio updatePersonaggio(@PathVariable Long id, @RequestBody Personaggio p) {
        Optional<Personaggio> existingPersonaggio = personaggioService.findById(id);
        if (existingPersonaggio.isPresent()) {
            p.setIdPersonaggio(id);
            return personaggioService.save(p);
        } else {
            return null; // or throw an exception, or return a response with an error message
        }
    }

    @DeleteMapping("/{id}")
    public void deletePersonaggio(@PathVariable Long id) {
        Optional<Personaggio> existingPersonaggio = personaggioService.findById(id);
        existingPersonaggio.ifPresent(personaggioService::delete);
    }
}