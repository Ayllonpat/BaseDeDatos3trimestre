package com.salesiannostriana.dam.primeproyectodatajpa.repositorio;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;

public class MainDeMentira {
	
	@Autowired
	private AlumnoRepository repositorio;

	@PostConstruct
	void ejecutar() {
		
	}
	
}
