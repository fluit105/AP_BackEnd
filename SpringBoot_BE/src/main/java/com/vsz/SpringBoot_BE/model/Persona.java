package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table (name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "nombre", length = 45, nullable = false)
	private String nombre;
	
	@Column (name = "apellido", length = 45, nullable = false)
	private String apellido;
	
	@Column (name = "domicilio", length = 45, nullable = false)
	private String domicilio;
	
	@Column (name = "fechaNac", nullable = false)
	private LocalDate fechaNac;
	
	@Column (name = "telefono", length = 12, nullable = false, unique = true)
	private String telefono;
	
	@Column (name = "correo", length = 45, nullable = false, unique = true)
	private String correo;
	
	@Column (name = "resumen", length = 500, nullable = false)
	private String resumen;
	
	@Column (name = "linkedin", length = 100, unique = true)
	private String linkedin;

	public Persona() {
	}

	public Persona(Long id, String nombre, String apellido, String domicilio, LocalDate fechaNac, String telefono, String correo, String resumen, String linkedin) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.fechaNac = fechaNac;
		this.telefono = telefono;
		this.correo = correo;
		this.resumen = resumen;
		this.linkedin = linkedin;
	}
	
}
