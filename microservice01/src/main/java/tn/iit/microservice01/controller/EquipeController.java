package tn.iit.microservice01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.request.CreateEquipeRequest;
import tn.iit.microservice01.response.EquipeResponse;
import tn.iit.microservice01.service.EquipeService;

import java.util.List;

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

    @PostMapping("createEquipe")
    public EquipeResponse createEquipe (@RequestBody CreateEquipeRequest createEquipeRequest) {
        return equipeService.createEquipe(createEquipeRequest);
    }


    @GetMapping("getAllEquipe")
    public List<Equipe> getAllEquipe() {
        return equipeService.getEquipe();
    }


    @GetMapping("getEquipeById/{id}")
    public CreateEquipeRequest getEquipeById(@PathVariable Long  id) {
        return equipeService.getEquipeById(id);
    }

    /*@GetMapping("getById/{id}")
    public CreateStudentRequest getById (@PathVariable long id) {
        return studentService.getSutdentById(id);
    }*/

   /* @PutMapping("updateEquipe/{id}")
    public Equipe updateEquipe(@PathVariable Long id, @RequestBody  Equipe equipe) {
        return equipeService.updateEquipe(id,equipe);
    }*/

    @PutMapping("updateEquipe/{id}")
    public Equipe updateEquipe(@PathVariable Long id, @RequestBody  CreateEquipeRequest createEquipeRequest) {
        return equipeService.updateEquipe(id,createEquipeRequest);
    }

    @DeleteMapping("deleteEquipe/{id}")
    public String deleteEquipe(@PathVariable Long id) {
        equipeService.deleteEquipe(id);
        return "equipe deleted";
    }

   @GetMapping("/order")
    List<Equipe> getAllOrder() {
        return  equipeService.getAllOrder();
    }
}
