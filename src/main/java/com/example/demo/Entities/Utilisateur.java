package com.example.demo.Entities;

public class Utilisateur {
	
	 private String identifiant;
	    private String motDePasse;
	    private String nom;
	    private String email;
	    private String poste;
		public String getIdentifiant() {
			return identifiant;
		}
		public void setIdentifiant(String identifiant) {
			this.identifiant = identifiant;
		}
		public String getMotDePasse() {
			return motDePasse;
		}
		public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPoste() {
			return poste;
		}
		public void setPoste(String poste) {
			this.poste = poste;
		}
		public Utilisateur(String identifiant, String motDePasse, String nom, String email, String poste) {
			super();
			this.identifiant = identifiant;
			this.motDePasse = motDePasse;
			this.nom = nom;
			this.email = email;
			this.poste = poste;
		}
	    
		
		
		
}
