package com.rpg.rpgGenerator.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
import java.sql.Timestamp;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public enum Categoria {
    @Id
    @Column(nullable = false)
    LADRO,
    GUERRIERO,
    NINJA;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fraseCategoria")
    private Descrizione fraseCategoria;

    @CreatedDate
    @Column
    private Timestamp dataCreazione;

    @LastModifiedDate
    @Column
    private Timestamp dataUltimaModifica;

    @Version
    @Column
    private int versione;
}