package tn.iit.microservice01.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.microservice01.entity.Partie;
import tn.iit.microservice01.repository.PartieRepository;

import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

@Service
public class PartieService {

    @Autowired
    PartieRepository partieRepository;


    public Partie save(Partie match) {
        return partieRepository.save(match);
    }

    public List<Partie> getAll() {
        return partieRepository.findAll();
    }

    public Partie Update(Long id, Partie match) {
        return partieRepository.saveAndFlush(match);
    }


    public boolean delete(Long id) {
        Optional<Partie> match = partieRepository.findById(id);
        if(match.isPresent()) {
            partieRepository.delete(match.get());
            return true;
        }
        return false;
    }

    public List<Partie> findByDate(LocalDateTime date) {
        return partieRepository.findByStartTime(date);
    }
    

}
