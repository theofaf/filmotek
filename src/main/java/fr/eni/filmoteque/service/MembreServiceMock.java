package fr.eni.filmoteque.service;

import fr.eni.filmoteque.bo.Membre;
import fr.eni.filmoteque.service.service_interface.ServiceMembre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class MembreServiceMock implements ServiceMembre {

    private final ArrayList<Membre> membres;

    public MembreServiceMock() {
        this.membres = new ArrayList<>();
        membres.add(new Membre(1, "faf", "theo"));
    }

    @Override
    public ArrayList<Membre> getListeMembresAll() {
        return this.membres;
    }

    @Override
    public Membre getMembreById(int id) {
        Membre membre = null;

        for (Membre m : this.getListeMembresAll()) {
            if (Objects.equals(m.getId(), id)) {
                membre = m;
                break;
            }
        }

        return membre;
    }
}
