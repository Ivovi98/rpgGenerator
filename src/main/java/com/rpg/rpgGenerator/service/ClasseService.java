package com.rpg.rpgGenerator.service;

import com.rpg.rpgGenerator.entity.Classe;
import com.rpg.rpgGenerator.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    public List<Classe> findAll() {
        return classeRepository.findAll();
    }

    public Optional<Classe> findById(Long id) {
        return classeRepository.findById(id);
    }

    public Classe save(Classe classe) {
        return classeRepository.save(classe);
    }

    public void delete(Classe classe) {
        classeRepository.delete(classe);
    }

    public List<Classe> findByNomeClasse(String nomeClasse) {
        return classeRepository.findByNomeClasse(nomeClasse);
    }
}