package com.rpg.rpgGenerator.repository;

import com.rpg.rpgGenerator.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query("SELECT c FROM Categoria c WHERE c.nomeAttributiCategoria LIKE %?1%")
    List<Categoria> findByNomeAttributiCategoriaContaining(String keyword);

    @Query("SELECT COUNT(c) FROM Categoria c")
    Long countAll();

    @Query("SELECT c.nomeAttributiCategoria FROM Categoria c")
    List<String> findAllNames();
}