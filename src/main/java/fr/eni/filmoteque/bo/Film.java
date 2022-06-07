package fr.eni.filmoteque.bo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;

//@Entity
//@Table(name="film")
public class Film {

//    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
//    @Column(nullable = false)
    private String titre;

//    @Column(nullable = false)
    private int duree;

    @Size(min = 20, max = 250)
//    @Column(nullable = false)
    private String synopsis;

    @NotBlank
//    @Column(nullable = false)
    private String annee;

    private ArrayList<Acteur> acteurs = new ArrayList<>();

//    @Column(nullable = false)
    private ArrayList<Realisateur> realisateurs = new ArrayList<>();

    private ArrayList<Avis> listeAvis = new ArrayList<>();

//    @ManyToOne
//    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public Film(int id, String titre, int duree, String synopsis, String annee) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.synopsis = synopsis;
        this.annee = annee;
    }

    public Film() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public ArrayList<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(ArrayList<Acteur> acteurs) {
        this.acteurs = acteurs;
    }

    public ArrayList<Realisateur> getRealisateurs() {
        return realisateurs;
    }

    public void setRealisateurs(ArrayList<Realisateur> realisateurs) {
        this.realisateurs = realisateurs;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public ArrayList<Avis> getListeAvis() {
        return listeAvis;
    }

    public void setListeAvis(ArrayList<Avis> avis) {
        this.listeAvis = avis;
    }

    public void addAvis(Avis avis) {
        this.listeAvis.add(avis);
    }

    public String toString(){
        return this.titre+" "+this.duree+" "+this.synopsis+
                this.annee;
    }
}
