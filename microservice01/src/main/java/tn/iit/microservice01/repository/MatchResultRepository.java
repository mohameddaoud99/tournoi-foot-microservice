package tn.iit.microservice01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.microservice01.entity.MatchResult;


@Repository
public interface MatchResultRepository extends JpaRepository<MatchResult, Long> {

    MatchResult findByMatchId(Long matchId);
}
