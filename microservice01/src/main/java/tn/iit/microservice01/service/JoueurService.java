package tn.iit.microservice01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.entity.Joueur;
import tn.iit.microservice01.repository.EquipeRepository;
import tn.iit.microservice01.repository.JoueurRepository;
import tn.iit.microservice01.request.CreateJoueurRequest;
import tn.iit.microservice01.response.JoueurResponse;

import java.util.Optional;
import org.springframework.http.HttpStatus;

@Service
public class JoueurService {


    @Autowired
    JoueurRepository joueurRepository;

 
 
    @Autowired
    private EquipeRepository equipeRepository;

    public JoueurResponse createJoueur(CreateJoueurRequest createJoueurRequest) {
       
        if (createJoueurRequest.getEquipeId() == null) {
            throw new IllegalArgumentException("Equipe ID is required for creating a joueur.");
        }

        Optional<Equipe> optionalEquipe = equipeRepository.findById(createJoueurRequest.getEquipeId());
        if (optionalEquipe.isEmpty()) {
            throw new IllegalArgumentException("Equipe with ID " + createJoueurRequest.getEquipeId() + " not found.");
        }

     
        Joueur joueur = new Joueur();
        joueur.setNom(createJoueurRequest.getNom());
        joueur.setPrenom(createJoueurRequest.getPrenom());
        joueur.setEquipe(optionalEquipe.get());

      
        Joueur savedJoueur = joueurRepository.save(joueur);

        return new JoueurResponse(savedJoueur);
    }

    
	
	public void deleteById(long id) {
	    Optional<Joueur> joueur = joueurRepository.findById(id);
	    if (joueur.isEmpty()) {
	        throw new JoueurNotFoundException("Joueur not found for deletion");
	    }
	    joueurRepository.deleteById(id);
	}
	

	 public Joueur getJoueurById(long id) {
	        Optional<Joueur> optionalJoueur = joueurRepository.findById(id);
	        return optionalJoueur.orElse(null);
	    }
	 
	   public Joueur updateJoueur(long id, CreateJoueurRequest updateRequest) {
	        Optional<Joueur> optionalJoueur = joueurRepository.findById(id);
	        if (optionalJoueur.isPresent()) {
	            Joueur existingJoueur = optionalJoueur.get();
	            existingJoueur.setNom(updateRequest.getNom());
	            existingJoueur.setPrenom(updateRequest.getPrenom());
	            
	            return joueurRepository.save(existingJoueur);
	        } else {
	            return null; 
	        }
	    }


}
