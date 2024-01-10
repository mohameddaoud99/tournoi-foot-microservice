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

    @Column(name = "nom_entraineur")
    private String nom_entraineur;

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

    public String getNom_entraineur() {
        return nom_entraineur;
    }

    public void setNom_entraineur(String nom_entraineur) {
        this.nom_entraineur = nom_entraineur;
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


