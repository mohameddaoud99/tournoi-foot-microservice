package tn.iit.microservice01.request;


import tn.iit.microservice01.entity.Joueur;

import java.util.HashSet;
import java.util.Set;

public class CreateEquipeRequest {

    private String nom;
    private String nom_entraineur;
    private Set<Joueur> joueurs = new HashSet<>();


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

    /*public void setJoueurs(Set<Joueur> joueurs) {
        this.joueurs = joueurs;

        for(Joueur c : joueurs){
            c.setEquipe(this);
        }
    }*/

}
