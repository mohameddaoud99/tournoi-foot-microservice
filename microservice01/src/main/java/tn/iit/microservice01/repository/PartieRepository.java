package tn.iit.microservice01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.microservice01.entity.Partie;


@Repository
public interface PartieRepository extends JpaRepository<Partie, Long> {
}
