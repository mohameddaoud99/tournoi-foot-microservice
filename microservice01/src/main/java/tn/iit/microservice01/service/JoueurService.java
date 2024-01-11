package tn.iit.microservice01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.microservice01.entity.Joueur;
import tn.iit.microservice01.repository.JoueurRepository;
import tn.iit.microservice01.request.CreateJoueurRequest;
import tn.iit.microservice01.response.JoueurResponse;


@Service
public class JoueurService {


    @Autowired
    JoueurRepository joueurRepository;

    /*public Joueur createJoueur(Joueur joueur) {
        return joueurRepository.save(joueur);
    }*/

    public JoueurResponse createJoueur(CreateJoueurRequest createJoueurRequest) {

        Joueur joueur = new Joueur();
        joueur.setNom(createJoueurRequest.getNom());
        joueur.setPrenom(createJoueurRequest.getPrenom());
        joueur.setEquipe(createJoueurRequest.getEquipe());


        joueur = joueurRepository.save(joueur);

        return new JoueurResponse(joueur);
    }




}
