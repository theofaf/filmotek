package fr.eni.filmoteque.ihm;

import fr.eni.filmoteque.bo.Film;
import fr.eni.filmoteque.service.service_interface.ServiceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class AccueilController {

    private ServiceFilm serviceFilm;

    @Autowired
    public AccueilController(ServiceFilm serviceFilm){
        this.serviceFilm = serviceFilm;
    }

    @GetMapping("/")
    public String index(Model modele, @ModelAttribute("films") ArrayList<Film> films) {
        modele.addAttribute("films", this.serviceFilm.getFilms());

        return "index";
    }

    @GetMapping("/detail/{id}")
    public String detailFilmById(@PathVariable String id, Model modele) {
        modele.addAttribute(this.serviceFilm.getFilmById(Integer.parseInt(id)));

        return "detail";
    }
}