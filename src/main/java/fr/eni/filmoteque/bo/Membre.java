package fr.eni.filmoteque.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;

//@Entity
//@Table(name="membre")
public class Membre extends Personne{

//    @Column(nullable = false)
    private boolean estAdmin = false;

//    @ManyToMany
    private ArrayList<Avis> avis;

    public Membre(int id, String nom, String prenom) {
        super(id, nom, prenom);
        avis = new ArrayList<>();
    }

    public Membre() {

    }

    public boolean isEstAdmin() {
        return estAdmin;
    }

    public void setEstAdmin(boolean estAdmin) {
        this.estAdmin = estAdmin;
    }

    public ArrayList<Avis> getAvis() {
        return avis;
    }

    public void setAvis(ArrayList<Avis> avis) {
        this.avis = avis;
    }

    public void addAvis(Avis avis) {
        this.avis.add(avis);
    }
}
