package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PDG extends Utilisateur{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idP;

	public PDG(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

}
