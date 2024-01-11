package tn.iit.microservice01.response;

import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.entity.Joueur;
import tn.iit.microservice01.repository.EquipeRepository;
import tn.iit.microservice01.request.CreateEntraineurRequest;
import tn.iit.microservice01.request.CreateEquipeRequest;

import java.util.HashSet;
import java.util.Set;

public class EquipeResponse {

    private Long id;
    private String nom;

    private int classement;

    private int points;

    private String nom_entraineur;
    private String prenom;

    private int age;
    private Set<Joueur> joueurs = new HashSet<>();


    public EquipeResponse(Equipe equipe, EntraineurResponse entraineurResponse) {
        this.id = equipe.getId();
        this.nom = equipe.getNom();
        this.classement = equipe.getClassement();
        this.points = equipe.getPoints();
        this.joueurs = equipe.getJoueurs();

        this.nom_entraineur = entraineurResponse.getNom();
        this.prenom = entraineurResponse.getPrenom();
        this.age = entraineurResponse.getAge();

    }


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

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getNom_entraineur() {
        return nom_entraineur;
    }

    public void setNom_entraineur(String nom_entraineur) {
        this.nom_entraineur = nom_entraineur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Set<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
}
