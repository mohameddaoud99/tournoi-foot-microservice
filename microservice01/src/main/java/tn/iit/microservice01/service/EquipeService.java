package tn.iit.microservice01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.proxies.EntraineurController;
import tn.iit.microservice01.repository.EquipeRepository;
import tn.iit.microservice01.request.CreateEntraineurRequest;
import tn.iit.microservice01.request.CreateEquipeRequest;
import tn.iit.microservice01.response.EntraineurResponse;
import tn.iit.microservice01.response.EquipeResponse;

import java.util.List;
import java.util.Optional;


@Service
public class EquipeService {
    @Autowired
    EquipeRepository equipeRepository;

    @Autowired
    private EntraineurController entraineur;

    public Equipe addEquipe(Equipe e)
    {
        return equipeRepository.save(e);
    }



    public EquipeResponse createEquipe(CreateEquipeRequest createEquipeRequest) {

        CreateEntraineurRequest entraineurRequest = new CreateEntraineurRequest();
        entraineurRequest.setNom(createEquipeRequest.getNom_entraineur());
        entraineurRequest.setPrenom(createEquipeRequest.getPrenom_entraineur());
        entraineurRequest.setAge(createEquipeRequest.getAge_entraineur());
        EntraineurResponse entraineurResponse = callEntraineurServiceSave(entraineurRequest);

        Equipe equipe = new Equipe();
        equipe.setNom(createEquipeRequest.getNom());
        equipe.setClassement(createEquipeRequest.getClassement());
        equipe.setPoints(createEquipeRequest.getPoints());
        equipe.setJoueurs(createEquipeRequest.getJoueurs());


        equipe.setId_entraineur(entraineurResponse.getId());
        equipe = equipeRepository.save(equipe);

        return new EquipeResponse(equipe, entraineurResponse);
    }

    private EntraineurResponse callEntraineurServiceSave(CreateEntraineurRequest entraineurRequest) {
        return entraineur.createEntraineur(entraineurRequest);
    }

    public Equipe updateEquipe(@PathVariable Long equipe_id, @RequestBody CreateEquipeRequest createEquipeRequest) {
        Optional<Equipe> emp = equipeRepository.findById(equipe_id);

        Equipe existEmp = emp.get();
        existEmp.setNom(createEquipeRequest.getNom());
        existEmp.setId_entraineur(createEquipeRequest.getId_entraineur());
        existEmp.setClassement(createEquipeRequest.getClassement());
        existEmp.setPoints(createEquipeRequest.getPoints());
        existEmp.setJoueurs(createEquipeRequest.getJoueurs());
        existEmp.setId_entraineur(createEquipeRequest.getId_entraineur());


        equipeRepository.save(existEmp);
        return existEmp;

    }


    public List<Equipe> getEquipe()
    {
        return equipeRepository.findAll();
    }

    /*public Equipe updateEquipe(@PathVariable Long equipe_id, @RequestBody Equipe equipe) {
        Optional<Equipe> emp = equipeRepository.findById(equipe_id);

        Equipe existEmp = emp.get();
        existEmp.setNom(equipe.getNom());
        existEmp.setId_entraineur(equipe.getId_entraineur());
        existEmp.setClassement(equipe.getClassement());
        existEmp.setPoints(equipe.getPoints());
        equipeRepository.save(existEmp);
        return existEmp;

    }*/

    public String deleteEquipe(Long equipeId) {

        equipeRepository.deleteById(equipeId);
        return "Success";
    }




   /* public EquipeResponse createEquipe(CreateAddressRequest createStudentRequest) {

        Address address = new Address();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());

        address = addressRepository.save(address);

        return new AddressResponse(address);
    }*/

}
