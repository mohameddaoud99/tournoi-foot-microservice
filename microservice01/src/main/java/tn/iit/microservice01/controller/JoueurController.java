package tn.iit.microservice01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.iit.microservice01.entity.Joueur;
import tn.iit.microservice01.request.CreateJoueurRequest;
import tn.iit.microservice01.response.JoueurResponse;
import tn.iit.microservice01.service.JoueurService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/joueurs")
public class JoueurController {

    @Autowired
    JoueurService joueurService;

 

    @PostMapping("addJoueur")
    public JoueurResponse addCompte(@RequestBody CreateJoueurRequest joueur) {
        return joueurService.createJoueur(joueur);
    }

   
    @DeleteMapping("/deleteJoueur/{id}")
    public ResponseEntity<String> deleteJoueur(@PathVariable long id) {
        joueurService.deleteById(id);
        return ResponseEntity.ok("Joueur with ID " + id + " has been deleted.");
    }
    
    
    @GetMapping("/getJoueurById/{id}")
    public ResponseEntity<Joueur> getJoueurById(@PathVariable long id) {
        Joueur joueur = joueurService.getJoueurById(id);
        if (joueur != null) {
            return ResponseEntity.ok(joueur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    @PutMapping("/updateJoueur/{id}")
    public ResponseEntity<Joueur> updateJoueur(@PathVariable long id, @RequestBody CreateJoueurRequest updateRequest) {
        Joueur updatedJoueur = joueurService.updateJoueur(id, updateRequest);
        if (updatedJoueur != null) {
            return ResponseEntity.ok(updatedJoueur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
