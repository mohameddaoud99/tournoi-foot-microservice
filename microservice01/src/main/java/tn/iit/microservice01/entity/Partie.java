package tn.iit.microservice01.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Partie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long equipe1Id;

    Long equipe2Id;


    LocalDateTime startTime;
    LocalDateTime endTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEquipe1Id() {
        return equipe1Id;
    }

    public void setEquipe1Id(Long equipe1Id) {
        this.equipe1Id = equipe1Id;
    }

    public Long getEquipe2Id() {
        return equipe2Id;
    }

    public void setEquipe2Id(Long equipe2Id) {
        this.equipe2Id = equipe2Id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }



}