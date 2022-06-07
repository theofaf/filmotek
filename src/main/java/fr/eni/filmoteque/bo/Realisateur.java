package fr.eni.filmoteque.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="realisateur")
public class Realisateur extends Personne{
    public Realisateur(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Realisateur() {

    }
}
