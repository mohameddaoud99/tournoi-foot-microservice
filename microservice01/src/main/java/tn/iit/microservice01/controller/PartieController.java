package tn.iit.microservice01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tn.iit.microservice01.entity.Partie;
import tn.iit.microservice01.service.PartieService;

import java.util.List;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/match")
public class PartieController {

    @Autowired
    PartieService partieService;

    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Partie> getAll() {
        return  partieService.getAll();
    }

    @PostMapping("save")
    Partie savePartie(@RequestBody Partie partie){
        return  partieService.save(partie);
    }


    @PutMapping("update/{id}")
    Partie updatePartie(@PathVariable Long id, @RequestBody  Partie partie){
        return  partieService.Update(id, partie);
    }

    @DeleteMapping("delete/{id}")
    boolean deletePartie(@PathVariable Long id){
        return  partieService.delete(id);
    }
    
    @GetMapping(value = "rechercherDate/{date}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Partie> rechercherDate(@PathVariable String date) {
      
        LocalDateTime parsedDate = LocalDateTime.parse(date);

        return partieService.findByDate(parsedDate);
    }


}
