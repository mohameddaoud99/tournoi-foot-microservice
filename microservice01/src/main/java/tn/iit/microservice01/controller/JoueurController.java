package tn.iit.microservice01.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.iit.microservice01.entity.Joueur;
import tn.iit.microservice01.service.JoueurService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/joueurs")
public class JoueurController {

    @Autowired
    JoueurService joueurService;

    /*@Autowired
    ClientDao clientDao;

    @Autowired
    CompteDao compteDao;*/

    @PostMapping("addJoueur")
    public Joueur addCompte(@RequestBody  Joueur joueur) {
        return joueurService.createJoueur(joueur);
    }

}
