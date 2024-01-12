package tn.iit.microservice01.request;


import tn.iit.microservice01.entity.Equipe;

public class CreateJoueurRequest {

    private String nom;

    private String prenom;


    private Long equipeId;

    //private Equipe equipe;




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

   /* public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }*/
    
    public Long getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(Long equipeId) {
        this.equipeId = equipeId;
    }
}
