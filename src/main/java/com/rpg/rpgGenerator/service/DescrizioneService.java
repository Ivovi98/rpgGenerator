package com.rpg.rpgGenerator.service;

import com.rpg.rpgGenerator.entity.Descrizione;
import com.rpg.rpgGenerator.repository.DescrizioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescrizioneService {

    @Autowired
    private DescrizioneRepository descrizioneRepository;

    public List<Descrizione> findAll() {
        return descrizioneRepository.findAll();
    }

    public Optional<Descrizione> findById(Long id) {
        return descrizioneRepository.findById(id);
    }

    public Descrizione save(Descrizione descrizione) {
        return descrizioneRepository.save(descrizione);
    }

    public void delete(Descrizione descrizione) {
        descrizioneRepository.delete(descrizione);
    }

    public List<Descrizione> findByCategoriaDescrizione(String categoriaDescrizione) {
        return descrizioneRepository.findByCategoriaDescrizione(categoriaDescrizione);
    }
}