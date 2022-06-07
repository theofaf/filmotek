package fr.eni.filmoteque.service.service_interface;

import fr.eni.filmoteque.bo.Film;

import java.util.ArrayList;

public interface ServiceFilm {
    void addFilm(Film film);
    ArrayList<Film> getFilms();
    Film getFilmById(int id);
}
