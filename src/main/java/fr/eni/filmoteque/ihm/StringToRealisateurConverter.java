package fr.eni.filmoteque.ihm;

import fr.eni.filmoteque.bo.Realisateur;
import fr.eni.filmoteque.service.RealisateurServiceMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToRealisateurConverter implements Converter<String, Realisateur> {

    private RealisateurServiceMock service;

    @Autowired
    public void setRealisateurService(RealisateurServiceMock service) {
        this.service = service;
    }

    @Override
    public Realisateur convert(String id) {
        return service.getMapRealisateurs().get(
            Integer.parseInt(id)
        );
    }
}
