package tn.iit.microservice01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.entity.Joueur;
import tn.iit.microservice01.service.EquipeService;
import tn.iit.microservice01.service.JoueurService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/equipes")
public class EquipeController {

    @Autowired
    EquipeService equipeService;


    @PostMapping("addEquipe")
    public Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }



}
