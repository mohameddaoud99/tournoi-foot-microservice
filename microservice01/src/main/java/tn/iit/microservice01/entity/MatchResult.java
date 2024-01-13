package tn.iit.microservice01.entity;

import jakarta.persistence.*;

@Entity
@Table
public class MatchResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long matchId;
    boolean isNullMatch;
    int butEquipe1;
    int ButEquipe2;
    Long equipeGId;

    Long equipeLId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public boolean isNullMatch() {
        return isNullMatch;
    }

    public void setNullMatch(boolean nullMatch) {
        isNullMatch = nullMatch;
    }

    public Long getEquipeGId() {
        return equipeGId;
    }

    public void setEquipeGId(Long equipeGId) {
        this.equipeGId = equipeGId;
    }

    public Long getEquipeLId() {
        return equipeLId;
    }

    public void setEquipeLId(Long equipeLId) {
        this.equipeLId = equipeLId;
    }

    public int getButEquipe1() {
        return butEquipe1;
    }

    public void setButEquipe1(int butEquipe1) {
        this.butEquipe1 = butEquipe1;
    }

    public int getButEquipe2() {
        return ButEquipe2;
    }

    public void setButEquipe2(int butEquipe2) {
        ButEquipe2 = butEquipe2;
    }
}
