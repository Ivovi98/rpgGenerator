package com.rpg.rpgGenerator.repository;

import com.rpg.rpgGenerator.entity.Abilita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AbilitaRepository extends JpaRepository<Abilita, Long> {

    @Query("SELECT a FROM Abilita a WHERE a.nomeAbilita = ?1")
    Abilita findByNomeAbilita(String nomeAbilita);

    @Query("SELECT a FROM Abilita a WHERE a.nomeAttributiAbilita LIKE %?1%")
    List<Abilita> findAllByNomeAttributiAbilitaContaining(String nomeAttributiAbilita);
}