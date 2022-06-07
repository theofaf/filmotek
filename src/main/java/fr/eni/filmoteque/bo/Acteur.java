package fr.eni.filmoteque.bo;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="acteur")
public class Acteur extends Personne{
    public Acteur(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Acteur() {

    }
}
