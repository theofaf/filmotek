package fr.eni.filmoteque.service;

import fr.eni.filmoteque.bo.Realisateur;
import fr.eni.filmoteque.service.service_interface.ServiceRealisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class RealisateurServiceMock implements ServiceRealisateur {

    private final ArrayList<Realisateur> listeRealisateurs;
    private final Map<Integer, Realisateur> mapRealisateurs;

    public RealisateurServiceMock() {
        listeRealisateurs = new ArrayList<>();
        listeRealisateurs.add( new Realisateur(1, "Dicaprio", "Leo"));
        listeRealisateurs.add( new Realisateur(2, "Carrey", "Jim"));
        listeRealisateurs.add(new Realisateur(3, "Smith", "Will"));
        listeRealisateurs.add(new Realisateur(4, "Depp", "Johnny"));
        listeRealisateurs.add(new Realisateur(5, "Watson", "Emma"));
        listeRealisateurs.add(new Realisateur(6, "Portman", "Nathalie"));
        listeRealisateurs.add(new Realisateur(7, "Lawrence", "Jennifer"));

        mapRealisateurs = new HashMap<>();
        listeRealisateurs.forEach(r -> mapRealisateurs.put(r.getId(), r));
    }

    @Override
    public ArrayList<Realisateur> getListeRealisateurs() {
        return this.listeRealisateurs;
    }

    @Override
    public Map<Integer, Realisateur> getMapRealisateurs() {
        return this.mapRealisateurs;
    }

    public Realisateur getRealisateurByNameAndFirstname(String nom, String prenom) {
        Realisateur realisateur = null;
        for (Realisateur r : listeRealisateurs) {
            if (Objects.equals(nom, r.getNom()) && Objects.equals(prenom, r.getPrenom())) {
                realisateur = r;
                break;
            }
        }
        return realisateur;
    }
}
