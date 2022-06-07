package fr.eni.filmoteque.bo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
//@Table(name="categorie")
public class Categorie {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @NotBlank
    private int id;

    @NotBlank
    @Column(nullable = false, length = 50)
    private String nom;

    public Categorie(int id, String nom){
        this.id = id;
        this.nom = nom;
    }

    public Categorie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
