package fr.eni.filmoteque.config;

import fr.eni.filmoteque.bo.Realisateur;
import fr.eni.filmoteque.service.RealisateurServiceMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;

@Configuration
public class ConfigRealisateur {

    @Bean
    @ApplicationScope
    public ArrayList<Realisateur> realisateurs(RealisateurServiceMock serviceRealisateur){
        return serviceRealisateur.getListeRealisateurs();
    }
}
