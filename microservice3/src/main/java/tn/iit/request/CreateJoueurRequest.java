package tn.iit.request;


public class CreateJoueurRequest {

	private String nom;

	private String prenom;
	
	private Long id_equipe;


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

	public Long getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(Long id_equipe) {
		this.id_equipe = id_equipe;
	}
}
