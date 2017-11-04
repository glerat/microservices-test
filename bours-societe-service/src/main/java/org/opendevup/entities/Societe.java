package org.opendevup.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;


@Entity
public class Societe implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nomSociete;

    public Societe() {
        super();
    }

    public Societe(String nomSociete) {
        super();
        this.nomSociete = nomSociete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void getNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }
}