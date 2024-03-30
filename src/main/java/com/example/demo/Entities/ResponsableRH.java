package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ResponsableRH extends Utilisateur {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;

	
	public ResponsableRH(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}
    // Ajoutez les propriétés spécifiques aux responsables RH si nécessaire
}