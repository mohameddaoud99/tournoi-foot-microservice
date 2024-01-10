package tn.iit.microservice01.response;


import tn.iit.microservice01.entity.Equipe;
import tn.iit.microservice01.entity.Joueur;

public class JoueurResponse {

    private String nom;

    private String prenom;


    private Equipe equipe;

    public JoueurResponse(Joueur joueur) {
        this.nom = joueur.getNom();
        this.prenom = joueur.getPrenom();
        this.equipe = joueur.getEquipe();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
