package tn.iit.microservice02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.iit.microservice02.request.CreateEntraineurRequest;
import tn.iit.microservice02.response.EntraineurResponse;
import tn.iit.microservice02.service.EntreneurService;

@RestController
@RequestMapping("/api/entraineur")
public class EntraineurController {

    @Autowired
    EntreneurService entreneurService;

    @PostMapping("/create")
    public EntraineurResponse createEntraineur (@RequestBody CreateEntraineurRequest createEntraineurRequest) {
        return entreneurService.createEntraineur(createEntraineurRequest);
    }
    @GetMapping("getById/{id}")

    public EntraineurResponse getById (@PathVariable long id) {
        System.out.println("its a me");
        return entreneurService.getEntraineurById(id);
    }

}
