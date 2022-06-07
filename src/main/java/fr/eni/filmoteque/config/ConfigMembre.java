package fr.eni.filmoteque.config;

import fr.eni.filmoteque.bo.Membre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Configuration
public class ConfigMembre {

    @Bean
    @SessionScope
    public ArrayList<Membre> membres(){
        return new ArrayList<>();
    }
}