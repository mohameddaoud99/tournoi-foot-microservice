package tn.iit.microservice01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.iit.microservice01.entity.Equipe;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {

    @Query("select e From Equipe e order by e.points desc ")
    List<Equipe> findAllOrder();


}
