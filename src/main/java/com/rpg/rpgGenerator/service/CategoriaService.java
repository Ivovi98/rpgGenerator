package com.rpg.rpgGenerator.service;

import com.rpg.rpgGenerator.entity.Categoria;
import com.rpg.rpgGenerator.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void delete(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    public List<Categoria> findByDescrizioneFraseCategoria(String descrizioneFraseCategoria) {
        return categoriaRepository.findByDescrizioneFraseCategoria(descrizioneFraseCategoria);
    }
}