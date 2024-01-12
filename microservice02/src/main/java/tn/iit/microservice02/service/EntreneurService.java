package tn.iit.microservice02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.microservice02.entity.Entraineur;
import tn.iit.microservice02.exception.AdressBadRequestException;
import tn.iit.microservice02.repository.EntraineurRepository;
import tn.iit.microservice02.request.CreateEntraineurRequest;
import tn.iit.microservice02.response.EntraineurResponse;

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

    public EntraineurResponse getEntraineurById(Long id) {
        Entraineur address = entraineurRepository.findById(id).orElseThrow(() -> new AdressBadRequestException(id.toString()));
        return new EntraineurResponse(address);

    }
}
