package tn.iit.microservice02.response;

import jakarta.persistence.Column;
import tn.iit.microservice02.entity.Entraineur;

public class EntraineurResponse {

    private Long id;

    private String nom;

    private String prenom;

    private int age;

    public EntraineurResponse(Entraineur entraineur) {
        this.id = entraineur.getId();
        this.nom = entraineur.getNom();
        this.prenom = entraineur.getPrenom();
        this.age = entraineur.getAge();
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
}
