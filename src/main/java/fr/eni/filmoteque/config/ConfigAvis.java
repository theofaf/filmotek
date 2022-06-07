package fr.eni.filmoteque.config;

import fr.eni.filmoteque.bo.Avis;
import fr.eni.filmoteque.service.AvisServiceMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;

@Configuration
public class ConfigAvis {

    @Bean
    @ApplicationScope
    public ArrayList<Avis> avis(AvisServiceMock serviceAvis){
        return serviceAvis.getListeAvisAll();
    }
}
