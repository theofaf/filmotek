package fr.eni.filmoteque.ihm;

import fr.eni.filmoteque.bo.Categorie;
import fr.eni.filmoteque.service.CategorieServiceMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCategorieConverter implements Converter<String, Categorie> {

    private CategorieServiceMock service;

    @Autowired
    public void setCategorieService(CategorieServiceMock service) {
        this.service = service;
    }

    @Override
    public Categorie convert(String id) {
        Integer theid = Integer.parseInt(id);

        return service.getMapCategorie().get(theid);
    }
}
