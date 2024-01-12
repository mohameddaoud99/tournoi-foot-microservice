package tn.iit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import tn.iit.entity.Carton;
import tn.iit.proxies.JoueurController;
import tn.iit.repository.CartonRepository;
import tn.iit.request.CreateJoueurRequest;
import tn.iit.request.CreateCartonRequest;
import tn.iit.response.JoueurResponse;
import tn.iit.response.CartonResponse;

@Service
public class CartonService {

	@Autowired
	private CartonRepository cartonRepository;
	
	@Autowired
	private JoueurController joueur;

//	@Autowired
//	private WebClient webClient;

	public CartonResponse createCarton(CreateCartonRequest createCartonRequest) {

		CreateJoueurRequest joueurRequest = new CreateJoueurRequest();
		joueurRequest.setNom(createCartonRequest.getNom());
		joueurRequest.setPrenom(createCartonRequest.getPrenom());
		joueurRequest.setId_equipe(createCartonRequest.getId_equipe());

		JoueurResponse joueurResponse = callJoueurServiceSave(joueurRequest);

		Carton carton = new Carton();
		carton.setCouleur(createCartonRequest.getCouleur());
		carton.setJoueurId(createCartonRequest.getId_joueur());
		carton = cartonRepository.save(carton);

		return new CartonResponse(carton, joueurResponse);
	}



	private JoueurResponse callJoueurServiceSave(CreateJoueurRequest joueurRequest) {
		return joueur.createCarton(joueurRequest);
	}

	public CartonResponse getById(long id) {
		Carton carton = cartonRepository.findById(id).get();
		JoueurResponse joueur = callJoueurServiceFind(carton.getJoueurId());
		return new CartonResponse(carton, joueur);
	}

	private JoueurResponse callJoueurServiceFind(Long joueurId) {
		
		return joueur.getById(joueurId);
	}


}
