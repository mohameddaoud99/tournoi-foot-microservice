package tn.iit.microservice01.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="equipe")
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "classement")
    private Integer classement;

    @Column(name = "points")
    private Integer points;

    @Column(name = "id_entraineur")
    private Long id_entraineur;

    @OneToMany(mappedBy = "equipe", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Set<Joueur> joueurs = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getClassement() {
        return classement;
    }

    public void setClassement(Integer classement) {
        this.classement = classement;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Long getId_entraineur() {
        return id_entraineur;
    }

    public void setId_entraineur(Long id_entraineur) {
        this.id_entraineur = id_entraineur;
    }

    public Set<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Set<Joueur> comptes) {
        this.joueurs = joueurs;

        for(Joueur c : comptes){
            c.setEquipe(this);
        }
    }
}


