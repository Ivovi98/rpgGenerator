package com.rpg.rpgGenerator.entity;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
import java.sql.Timestamp;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Abilita {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nomeAbilita;

    @CreatedDate
    @Column(nullable = false)
    private Timestamp dataCreazione;

    @LastModifiedDate
    @Column(nullable = false)
    private Timestamp dataUltimaModifica;

    @Version
    @Column(nullable = false)
    private int versione;

    @Column(nullable = false)
    private String nomeAttributiAbilita;

    @Column(nullable = false)
    private String descrizioneAbilita;
}
