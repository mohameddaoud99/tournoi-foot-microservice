package tn.iit.microservice01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.iit.microservice01.entity.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {


}
