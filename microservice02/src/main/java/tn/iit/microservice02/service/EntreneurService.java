package tn.iit.microservice02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.microservice02.entity.Entraineur;
import tn.iit.microservice02.exception.AdressBadRequestException;
import tn.iit.microservice02.repository.EntraineurRepository;
import tn.iit.microservice02.request.CreateEntraineurRequest;
import tn.iit.microservice02.response.EntraineurResponse;
import java.util.Optional;

@Service
public class EntreneurService {

    @Autowired
    EntraineurRepository entraineurRepository;

    public EntraineurResponse createEntraineur(CreateEntraineurRequest createEntraineurRequest) {

        Entraineur entraineur = new Entraineur();
        entraineur.setNom(createEntraineurRequest.getNom());
        entraineur.setPrenom(createEntraineurRequest.getPrenom());
        entraineur.setAge(createEntraineurRequest.getAge());


        entraineur = entraineurRepository.save(entraineur);
        return new EntraineurResponse(entraineur);
    }
    
	public EntraineurResponse getEntraineurById (long id) {
		Optional<Entraineur> entraineur = entraineurRepository.findById(id);
		if(entraineur.isEmpty()) {
			throw new EntreneurNotFoundException("entraineur inexistante");
		}
		return new EntraineurResponse(entraineurRepository.findById(id).get());
	}
	 public void deleteById(long id) {
	        Optional<Entraineur> entraineur = entraineurRepository.findById(id);
	        if (entraineur.isPresent()) {
	            entraineurRepository.deleteById(id);
	        } else {
	            throw new EntreneurNotFoundException("Entraineur inexistant");
	        }
	    }
	 
	  public EntraineurResponse updateEntraineur(long id, CreateEntraineurRequest createEntraineurRequest) {
	        Optional<Entraineur> optionalEntraineur = entraineurRepository.findById(id);


	        if (optionalEntraineur.isPresent()) {
	            Entraineur entraineur = optionalEntraineur.get();
	            entraineur.setNom(createEntraineurRequest.getNom());
	            entraineur.setPrenom(createEntraineurRequest.getPrenom());
	            entraineur.setAge(createEntraineurRequest.getAge());

	            entraineurRepository.save(entraineur);
	            return new EntraineurResponse(entraineur);
	        } else {
	            throw new EntreneurNotFoundException("Entraineur inexistant");
	        }
	    }

    public EntraineurResponse getEntraineurById(Long id) {
        Entraineur address = entraineurRepository.findById(id).orElseThrow(() -> new AdressBadRequestException(id.toString()));
        return new EntraineurResponse(address);

    }

}
