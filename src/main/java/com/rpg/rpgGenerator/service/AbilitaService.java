package com.rpg.rpgGenerator.service;

import com.rpg.rpgGenerator.entity.Abilita;
import com.rpg.rpgGenerator.repository.AbilitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbilitaService {

    @Autowired
    private AbilitaRepository abilitaRepository;

    public List<Abilita> findAll() {
        return abilitaRepository.findAll();
    }

    public Abilita findByNomeAbilita(String nomeAbilita) {
        return abilitaRepository.findByNomeAbilita(nomeAbilita);
    }

    public List<Abilita> findAllByNomeAttributiAbilitaContaining(String nomeAttributiAbilita) {
        return abilitaRepository.findAllByNomeAttributiAbilitaContaining(nomeAttributiAbilita);
    }

    public Abilita save(Abilita abilita) {
        return abilitaRepository.save(abilita);
    }

    public void delete(Abilita abilita) {
        abilitaRepository.delete(abilita);
    }

    public Optional<Abilita> findById(String id) {
        return abilitaRepository.findById(id);
    }
}