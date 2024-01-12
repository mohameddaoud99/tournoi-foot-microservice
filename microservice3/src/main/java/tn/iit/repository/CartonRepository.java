package tn.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entity.Carton;

@Repository
public interface CartonRepository extends JpaRepository<Carton, Long> {

	
	
}
