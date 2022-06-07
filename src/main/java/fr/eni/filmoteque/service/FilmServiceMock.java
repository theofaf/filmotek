package fr.eni.filmoteque.service;

import fr.eni.filmoteque.bo.Acteur;
import fr.eni.filmoteque.bo.Film;
import fr.eni.filmoteque.bo.Realisateur;
import fr.eni.filmoteque.service.service_interface.ServiceFilm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FilmServiceMock implements ServiceFilm {

    private ArrayList<Film> films;

    public FilmServiceMock(CategorieServiceMock serviceMockCategorie, RealisateurServiceMock serviceMockRealisateur) {
        this.films = new ArrayList<>();

        Realisateur leo = serviceMockRealisateur.getRealisateurByNameAndFirstname("Dicaprio", "Leo");
        Film film1 = new Film(1, "Titanic", 220, "Attention ça va couler", "1976");
        film1.setCategorie(serviceMockCategorie.getCategorieByName("Drame"));

        ArrayList<Acteur> acteurFilm1 = new ArrayList<>();
        acteurFilm1.add(new Acteur(1, "DICAPRISUN", "LEO"));
        acteurFilm1.add(new Acteur(2, "WINSLET", "SKATE"));
        film1.setActeurs(acteurFilm1);

        ArrayList<Realisateur> realisateurFilm1 = new ArrayList<>();
        realisateurFilm1.add(leo);
        film1.setRealisateurs(realisateurFilm1);

        films.add(film1);


        Film film2 = new Film(2, "Avatar", 180, "Les schtroumpf en mieux", "1992");
        film2.setCategorie(serviceMockCategorie.getCategorieByName("Fantastique"));

        ArrayList<Acteur> acteurFilm2 = new ArrayList<>();
        acteurFilm2.add(new Acteur(3, "WHORTHINGTON", "SAM"));
        acteurFilm2.add(new Acteur(4, "SALDENA", "ZOE"));
        film2.setActeurs(acteurFilm2);

        ArrayList<Realisateur> realisateurFilm2 = new ArrayList<>();
        realisateurFilm2.add(leo);
        film2.setRealisateurs(realisateurFilm2);

        films.add(film2);
    }

    public void addFilm(Film film){
        films.add(film);
    }

    public ArrayList<Film> getFilms(){

        return films;
    }

    public Film getFilmById(int id) {
        Film film = null;
        for (Film f : this.getFilms()){
            if (f.getId() == id){
                film = f;
            }
        }
        return film;
    }
}