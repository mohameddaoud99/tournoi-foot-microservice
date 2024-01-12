package tn.iit.request;


public class CreateCartonRequest {

	private String couleur;

	private String nom;

	private String prenom;
	
	private Long id_joueur;
	private Long id_equipe;


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

	public Long getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(Long id_equipe) {
		this.id_equipe = id_equipe;
	}
}
