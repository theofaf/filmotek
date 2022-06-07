package fr.eni.filmoteque.config;

import fr.eni.filmoteque.bo.Categorie;
import fr.eni.filmoteque.service.CategorieServiceMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;

@Configuration
public class ConfigCategorie {

    @Bean
    @ApplicationScope
    public ArrayList<Categorie> categories(CategorieServiceMock serviceCategorie){
        return serviceCategorie.getListeCategorie();
    }
}
