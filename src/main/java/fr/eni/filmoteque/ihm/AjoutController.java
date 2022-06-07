package fr.eni.filmoteque.ihm;

import fr.eni.filmoteque.bo.Avis;
import fr.eni.filmoteque.bo.Film;
import fr.eni.filmoteque.service.service_interface.ServiceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AjoutController {

    private final ServiceFilm serviceFilm;

    @Autowired
    public AjoutController(ServiceFilm serviceFilm) {
        this.serviceFilm = serviceFilm;
    }

    @GetMapping("/ajout/film")
    public String ajoutFilm(Model modele) {

        modele.addAttribute("film", new Film());
        return "ajout";
    }

    @PostMapping("/ajout/film")
    public String ajoutFilmPost(
            @Valid @ModelAttribute("film") Film film,
            BindingResult validationResult,
            Model modele
    ) {
        if(validationResult.hasErrors()) {
            return "ajout";
        }

        this.serviceFilm.addFilm(film);
        modele.addAttribute("films", this.serviceFilm.getFilms());

        return "index";
    }

    @GetMapping("/ajout/avis/{idFilm}")
    public String ajoutAvisPost(@PathVariable String idFilm, Model modele) {
        modele.addAttribute("avis", new Avis());

        return "ajout_avis";
    }

    @PostMapping("/ajout/film/{id-film}")
    public String ajoutFilmPost(
            @Valid @ModelAttribute("avis") Avis avis,
            BindingResult validationResult,
            Model modele
    ) {
       return "ajout_avis";
    }
}
