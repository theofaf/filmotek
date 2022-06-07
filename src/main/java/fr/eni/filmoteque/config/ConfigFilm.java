package fr.eni.filmoteque.config;

import java.util.ArrayList;

import fr.eni.filmoteque.bo.Film;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ConfigFilm {

    @Bean
    @SessionScope
    public ArrayList<Film> films(){
        return new ArrayList<>();
    }
}
