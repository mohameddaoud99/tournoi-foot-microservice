package tn.iit.microservice01.request;


import tn.iit.microservice01.entity.Joueur;

import java.util.HashSet;
import java.util.Set;

public class CreateEquipeRequest {

    private String nom;

    private int classement;

    private int points;

    public String getNom_entraineur() {
        return nom_entraineur;
    }

    public void setNom_entraineur(String nom_entraineur) {
        this.nom_entraineur = nom_entraineur;
    }

    public int getAge_entraineur() {
        return age_entraineur;
    }

    public void setAge_entraineur(int age_entraineur) {
        this.age_entraineur = age_entraineur;
    }

    public void setJoueurs(Set<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    private String nom_entraineur;

    private String prenom_entraineur;

    public String getPrenom_entraineur() {
        return prenom_entraineur;
    }

    public void setPrenom_entraineur(String prenom_entraineur) {
        this.prenom_entraineur = prenom_entraineur;
    }

    private int age_entraineur;

    private Long id_entraineur;
    private Set<Joueur> joueurs = new HashSet<>();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId_entraineur() {
        return id_entraineur;
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

    public void setId_entraineur(Long id_entraineur) {
        this.id_entraineur = id_entraineur;
    }

    public Set<Joueur> getJoueurs() {
        return joueurs;
    }

    /*public void setJoueurs(Set<Joueur> joueurs) {
        this.joueurs = joueurs;

        for(Joueur c : joueurs){
            c.setEquipe(this);
        }
    }*/

}
