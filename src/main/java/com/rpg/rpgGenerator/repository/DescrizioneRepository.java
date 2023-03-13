package com.rpg.rpgGenerator.repository;

import com.rpg.rpgGenerator.entity.Descrizione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DescrizioneRepository extends JpaRepository<Descrizione, Long> {

    @Query("SELECT d FROM Descrizione d WHERE d.nomeClasse = ?1")
    Descrizione findByNomeClasse(String nomeClasse);

    @Query("SELECT d FROM Descrizione d WHERE d.abilita.nomeAttributiAbilita LIKE %?1%")
    List<Descrizione> findAllByNomeAttributiAbilitaContaining(String nomeAttributiAbilita);

    @Query("SELECT d FROM Descrizione d WHERE d.categoria.descrizioneFraseCategoria = ?1")
    Descrizione findByCategoria(String categoria);
}