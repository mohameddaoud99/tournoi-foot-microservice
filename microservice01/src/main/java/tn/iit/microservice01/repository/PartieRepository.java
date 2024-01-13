package tn.iit.microservice01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.microservice01.entity.Partie;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PartieRepository extends JpaRepository<Partie, Long> {
	List<Partie> findByStartTime(LocalDateTime startTime);
}
