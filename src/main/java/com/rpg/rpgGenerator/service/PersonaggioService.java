package com.rpg.rpgGenerator.service;

import com.rpg.rpgGenerator.entity.Personaggio;
import com.rpg.rpgGenerator.repository.PersonaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaggioService {

    @Autowired
    private PersonaggioRepository personaggioRepository;

    public List<Personaggio> findAll() {
        return personaggioRepository.findAll();
    }

    public Optional<Personaggio> findById(Long id) {
        return personaggioRepository.findById(id);
    }

    public Personaggio save(Personaggio personaggio) {
        return personaggioRepository.save(personaggio);
    }

    public void delete(Personaggio personaggio) {
        personaggioRepository.delete(personaggio);
    }
}