package com.rpg.rpgGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpgGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgGeneratorApplication.class, args);
	}

}
		/*
		Si vuole creare un database per tenere traccia dei personaggi di
		gioco di ruolo. Ogni personaggio ha un nome,
		una classe, un livello e diversi attributi come forza,
		destrezza, costituzione, intelligenza,
		saggezza e carisma.

		Ogni classe ha un nome,
		una descrizione e specifiche restrizioni per i
		valori degli attributi.

		Ogni abilità ha un nome,
		una descrizione e appartiene a una sola classe.
		Ogni descrizione è caratterizzata da una frase e
		una categoria, come personalità, abilità o storia.
		Ogni categoria ha un nome.

		La relazione tra il personaggio e la classe è di
		appartenenza, mentre la relazione tra la classe e l'abilità
		è di possesso. La relazione tra la descrizione
		e la categoria è di appartenenza, mentre la relazione
		tra la categoria e la descrizione è di possesso.

		Personaggio: con attributi nome, classe (FK), livello,
		forza, destrezza, costituzione, intelligenza, saggezza,
		carisma
		Classe: con attributi nome (PK), descrizione, forza_min,
		forza_max, destrezza_min, destrezza_max,
		costituzione_min, costituzione_max, intelligenza_min,
		intelligenza_max, saggezza_min, saggezza_max,
		carisma_min, carisma_max
		Abilità: con attributi nome (PK), descrizione, classe (FK)
		Descrizione: con attributi frase (PK), categoria
		(es. personalità, abilità, storia)
		Categoria: con attributi nome (PK)
		*/