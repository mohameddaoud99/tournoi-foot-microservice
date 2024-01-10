package tn.iit.microservice01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.repository.EquipeRepository;
import tn.iit.microservice01.response.EquipeResponse;


@Service
public class EquipeService {
    @Autowired
    EquipeRepository equipeRepository;

    public Equipe addEquipe(Equipe e)
    {
        return equipeRepository.save(e);
    }

   /* public EquipeResponse createEquipe(CreateAddressRequest createStudentRequest) {

        Address address = new Address();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());

        address = addressRepository.save(address);

        return new AddressResponse(address);
    }*/

}
