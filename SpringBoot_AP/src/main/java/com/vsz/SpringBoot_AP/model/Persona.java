package com.vsz.SpringBoot_AP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nombre;
	private String apellido;

	public Persona() {
	}

	public Persona(Long id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
}
