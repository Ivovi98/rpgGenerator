package com.rpg.rpgGenerator.repository;

import com.rpg.rpgGenerator.entity.Descrizione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DescrizioneRepository extends JpaRepository<Descrizione, String> {

    @Query("SELECT d FROM Descrizione d WHERE d.categoriaDescrizione = :categoriaDescrizione")
    Descrizione findByCategoriaDescrizione(String categoriaDescrizione);

    /*@Query("SELECT d FROM Descrizione d WHERE d.abilita.nomeAttributiAbilita = :nomeAttributiAbilita")
    List<Descrizione> findAllByNomeAttributiAbilitaContaining(String nomeAttributiAbilita);*/
}