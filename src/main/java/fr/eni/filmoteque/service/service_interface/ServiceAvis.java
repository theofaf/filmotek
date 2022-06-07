package fr.eni.filmoteque.service.service_interface;

import fr.eni.filmoteque.bo.Avis;
import fr.eni.filmoteque.bo.Membre;

import java.util.ArrayList;

public interface ServiceAvis {

    ArrayList<Avis> getListeAvisAll();
    ArrayList<Avis> getListeAvisByMembre(Membre membre);
    Avis getListeAvisById(int id);
}
