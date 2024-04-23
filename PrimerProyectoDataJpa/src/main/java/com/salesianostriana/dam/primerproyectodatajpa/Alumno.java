package com.salesianostriana.dam.primerproyectodatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Alumno {
	@Id @GeneratedValue  //deben de ser jakarta
	private Long id;
	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
}
