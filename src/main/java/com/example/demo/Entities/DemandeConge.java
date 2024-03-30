package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class DemandeConge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private String typeConge;
    private String etatDemande; // En attente, approuvée, refusée
    @ManyToOne
    private User demandeur;
    // Getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getTypeConge() {
		return typeConge;
	}
	public void setTypeConge(String typeConge) {
		this.typeConge = typeConge;
	}
	public String getEtatDemande() {
		return etatDemande;
	}
	public void setEtatDemande(String etatDemande) {
		this.etatDemande = etatDemande;
	}
	public User getDemandeur() {
		return demandeur;
	}
	public void setDemandeur(User demandeur) {
		this.demandeur = demandeur;
	}
	public DemandeConge(Date dateDebut, Date dateFin, String typeConge, String etatDemande, User demandeur) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.typeConge = typeConge;
		this.etatDemande = etatDemande;
		this.demandeur = demandeur;
	}
	public DemandeConge() {
		super();
	}
    
}
