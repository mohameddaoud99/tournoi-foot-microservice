package tn.iit.microservice02.request;

//import tn.iit.microservice01.entity.Joueur;

import java.util.HashSet;
import java.util.Set;

public class CreateEntraineurRequest {


    private String nom;
    private String prenom;

    private int age;

    private int classement;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private int points;

    private Long id_entraineur;
    //private Set<Joueur> joueurs = new HashSet<>();


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

    public Long getId_entraineur() {
        return id_entraineur;
    }

    public void setId_entraineur(Long id_entraineur) {
        this.id_entraineur = id_entraineur;
    }

    /*public Set<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Set<Joueur> joueurs) {
        this.joueurs = joueurs;
    }*/
}
