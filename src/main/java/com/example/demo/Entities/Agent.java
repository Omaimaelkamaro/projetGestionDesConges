package com.example.demo.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Agent extends User {
	    // Ajoutez les propriétés spécifiques aux agents si nécessaire
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgent;
	
	}


