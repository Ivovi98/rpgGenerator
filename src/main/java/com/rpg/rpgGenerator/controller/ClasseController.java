package com.rpg.rpgGenerator.controller;

import com.rpg.rpgGenerator.entity.Classe;
import com.rpg.rpgGenerator.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/classe")
public class ClasseController {

    @Autowired
    private ClasseService classeService;

    @GetMapping("/{id}") //READ GET BY ID
    public ResponseEntity<Classe> getClasseById(@PathVariable String id){
        Optional<Classe> existingClasse = classeService.findById(id);
        try {
            if(existingClasse.isPresent()){
                return new ResponseEntity<>(existingClasse.get(), HttpStatus.OK);
            }
            else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /* METODO GET
    @GetMapping("/{id}")
    public ResponseEntity<?> getClasse(@PathVariable String id) {
        Optional<Classe> classe = classeService.findById(id);
        if (classe.isPresent()) {
            return new ResponseEntity<>(classe.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
     */

    @PostMapping
    public ResponseEntity<?> addClasse(@RequestBody Classe classe) {
        Classe createdClasse = classeService.insertClasse(classe);
        return new ResponseEntity<>(createdClasse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateClasse(@PathVariable String id, @RequestBody Classe classe) {
        Optional<Classe> existingClasse = classeService.findById(id);
        if (existingClasse.isPresent()) {
            classe.setId(id);
            Classe updatedClasse = classeService.save(classe);
            return new ResponseEntity<>(updatedClasse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClasse(@PathVariable String id) {
        Optional<Classe> existingClasse = classeService.findById(id);
        if (existingClasse.isPresent()) {
            classeService.delete(existingClasse.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchClasse(@RequestParam String nomeClasse) {
        Classe classe = classeService.findByNomeClasse(nomeClasse);
        if (classe != null) {
            return new ResponseEntity<>(classe, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}