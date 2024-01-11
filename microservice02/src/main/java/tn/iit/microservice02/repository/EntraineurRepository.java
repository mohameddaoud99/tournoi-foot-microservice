package tn.iit.microservice02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.iit.microservice02.entity.Entraineur;

public interface EntraineurRepository extends JpaRepository<Entraineur, Long> {


}
