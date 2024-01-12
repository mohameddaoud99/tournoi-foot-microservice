package tn.iit.response;

import tn.iit.entity.Carton;

public class CartonResponse {

	
	private long id;

	private String couleur;

	private String nom;

	private String prenom;
	
	private Long id_joueur;
	

	public CartonResponse(Carton carton, JoueurResponse joueur) {
		this.id = carton.getId();
		this.couleur = carton.getCouleur();
		this.nom = joueur.getNom();
		this.prenom = joueur.getPrenom();
		this.id_joueur = carton.getJoueurId();

	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
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

	public Long getId_joueur() {
		return id_joueur;
	}

	public void setId_joueur(Long id_joueur) {
		this.id_joueur = id_joueur;
	}
}
