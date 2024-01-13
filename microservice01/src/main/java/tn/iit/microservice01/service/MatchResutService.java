package tn.iit.microservice01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.entity.MatchResult;
import tn.iit.microservice01.entity.Partie;
import tn.iit.microservice01.repository.EquipeRepository;
import tn.iit.microservice01.repository.MatchResultRepository;
import tn.iit.microservice01.repository.PartieRepository;

import java.util.List;
import java.util.Optional;


@Service
public class MatchResutService {

    @Autowired
    MatchResultRepository matchResultRepository;
    @Autowired
    PartieRepository partieRepository;
    @Autowired
    EquipeRepository equipeRepository;

    public MatchResult save(MatchResult matchResult) {

        Partie p = partieRepository.getOne(matchResult.getMatchId());
        partieRepository.saveAndFlush(p);
        if(matchResult.isNullMatch()) {
            Equipe e1 = equipeRepository.getOne(p.getEquipe1Id());
            Equipe e2 = equipeRepository.getOne(p.getEquipe2Id());
            e1.setPoints(e1.getPoints()+1);
            e2.setPoints(e2.getPoints()+1);
            equipeRepository.saveAndFlush(e1);
            equipeRepository.saveAndFlush(e2);
        } else {
            Equipe e1 = equipeRepository.getOne(matchResult.getEquipeGId());
            e1.setPoints(e1.getPoints()+3);
            equipeRepository.saveAndFlush(e1);
        }



        return matchResultRepository.save(matchResult);
    }

    public MatchResult Update(Long id, MatchResult matchResult) {
        return matchResultRepository.saveAndFlush(matchResult);
    }

    public boolean delete(Long id) {
        Optional<MatchResult> matchResult = matchResultRepository.findById(id);
        if(matchResult.isPresent()) {
            matchResultRepository.delete(matchResult.get());
            return true;
        }
        return false;
    }

    public List<MatchResult> getAll() {
        return matchResultRepository.findAll();
    }

    public MatchResult getByMatch(Long idMatch) {
        return matchResultRepository.findByMatchId(idMatch);
    }
}
