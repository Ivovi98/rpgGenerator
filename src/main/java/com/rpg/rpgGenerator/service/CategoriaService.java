package com.rpg.rpgGenerator.service;

import com.rpg.rpgGenerator.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<String> findAllNames() {
        return categoriaRepository.findAllNames();
    }
}