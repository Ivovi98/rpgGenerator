package com.rpg.rpgGenerator.service;

import com.rpg.rpgGenerator.entity.Classe;
import com.rpg.rpgGenerator.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    public Classe findByNomeClasse(String nomeClasse) {
        return classeRepository.findByNomeClasse(nomeClasse);
    }

    public Classe saveClasse(Classe classe) {
        return classeRepository.save(classe);
    }

    public void deleteClasse(Classe classe) {
        classeRepository.delete(classe);
    }
}