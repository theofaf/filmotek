package fr.eni.filmoteque.bo;

import javax.persistence.*;

//@Entity
//@Table(name="avis")
public class Avis {

//    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

//    @ManyToOne
//    @JoinColumn(name = "membre_id")
    private Membre membre;

//    @ManyToOne
//    @JoinColumn(name = "film_id")
    private Film film;

//    @Column(nullable = false)
    private String commentaire;
//
//    @Column(nullable = false)
    private int note;

    public Avis(int id, Membre membre, Film film, String commentaire, int note) {
        this.id = id;
        this.membre = membre;
        this.film = film;
        this.commentaire = commentaire;
        this.note = note;
    }

    public Avis() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
