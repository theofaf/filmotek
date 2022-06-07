package fr.eni.filmoteque.service.service_interface;

import fr.eni.filmoteque.bo.Membre;

import java.util.ArrayList;

public interface ServiceMembre {

    ArrayList<Membre> getListeMembresAll();
    Membre getMembreById(int id);
}
