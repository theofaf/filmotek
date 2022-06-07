package fr.eni.filmoteque.bo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

//@Entity
//@Table(name="personne")
public abstract class Personne {

//    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
//    @Column(nullable = false, length = 50)
    private String nom;
    
    @NotBlank
//    @Column(nullable = false, length = 50)
    private String prenom;

    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne() {

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String toString() {
        return this.getClass().getName() +
            ": id=" +  this.id +
            ": nom=" +  this.nom +
            ": prenom=" +  this.prenom;
    }
}
