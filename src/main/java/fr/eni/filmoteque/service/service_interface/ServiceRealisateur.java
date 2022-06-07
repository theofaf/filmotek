package fr.eni.filmoteque.service.service_interface;

import fr.eni.filmoteque.bo.Realisateur;

import java.util.ArrayList;
import java.util.Map;

public interface ServiceRealisateur {
    ArrayList<Realisateur> getListeRealisateurs();
    Map<Integer, Realisateur> getMapRealisateurs();
    Realisateur getRealisateurByNameAndFirstname(String nom, String prenom);
}
