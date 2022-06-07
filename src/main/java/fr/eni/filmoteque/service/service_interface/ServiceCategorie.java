package fr.eni.filmoteque.service.service_interface;

import fr.eni.filmoteque.bo.Categorie;

import java.util.ArrayList;
import java.util.Map;

public interface ServiceCategorie {
    ArrayList<Categorie> getListeCategorie();
    Map<Integer, Categorie> getMapCategorie();
    Categorie getCategorieByName(String nom);
}
