package fr.eni.filmoteque.service;

import fr.eni.filmoteque.bo.Avis;
import fr.eni.filmoteque.bo.Film;
import fr.eni.filmoteque.bo.Membre;
import fr.eni.filmoteque.service.service_interface.ServiceAvis;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class AvisServiceMock implements ServiceAvis {

    private final ArrayList<Avis> listeAvis;

    public AvisServiceMock(MembreServiceMock serviceMembre, FilmServiceMock serviceFilm) {
        listeAvis = new ArrayList<>();
        Membre faf = serviceMembre.getMembreById(1);
        Film titanic = serviceFilm.getFilmById(1);
        Avis avisTitanicFaf = new Avis(1, faf, titanic, "pas fou, plus nul que -bien/20", 1);

        faf.addAvis(avisTitanicFaf);
        titanic.addAvis(avisTitanicFaf);
    }

    @Override
    public ArrayList<Avis> getListeAvisAll() {
        return this.listeAvis;
    }

    @Override
    public ArrayList<Avis> getListeAvisByMembre(Membre membre) {
        ArrayList<Avis> avis = new ArrayList<>();

        for (Avis a : this.getListeAvisAll()) {
            if (Objects.equals(a.getMembre(), membre)) {
                avis.add(a);
            }
        }

        return avis;
    }

    @Override
    public Avis getListeAvisById(int id) {
        Avis avis = null;

        for (Avis a : this.getListeAvisAll()) {
            if (Objects.equals(a.getId(), id)) {
                avis = a;
                break;
            }
        }

        return avis;
    }
}
