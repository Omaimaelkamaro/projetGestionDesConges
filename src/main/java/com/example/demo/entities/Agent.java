package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Agent extends com.example.demo.entities.Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgent;
	public Agent(){
		super();
	}
	    public Agent(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}}

	// Ajoutez les propriétés spécifiques aux agents si nécessaire


