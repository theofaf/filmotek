package fr.eni.filmoteque.service;

import fr.eni.filmoteque.bo.Categorie;
import fr.eni.filmoteque.service.service_interface.ServiceCategorie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class CategorieServiceMock implements ServiceCategorie {

    private final ArrayList<Categorie> listeCategories;
    private final Map<Integer, Categorie> mapCategories;

    public CategorieServiceMock() {
        listeCategories = new ArrayList<>();
        listeCategories.add( new Categorie(1, "Drame"));
        listeCategories.add( new Categorie(2, "Fantastique"));
        listeCategories.add(new Categorie(3, "Comedie"));

        mapCategories = new HashMap<>();
        listeCategories.forEach(m -> mapCategories.put(m.getId(), m));
    }

    public ArrayList<Categorie> getListeCategorie() {
        return listeCategories;
    }

    public Categorie getCategorieByName(String nom) {
        Categorie categorie = null;
        for (Categorie c : listeCategories) {
            if (Objects.equals(nom, c.getNom())) {
                categorie = c;
            }
        }
        return categorie;
    }

    public Map<Integer, Categorie> getMapCategorie(){
        return mapCategories;
    }
}