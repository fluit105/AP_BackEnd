package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "certificacion")
public class Certificacion {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 45, nullable = false)
    private String titulo;

    @Column(name = "descripcion", length = 45, nullable = false)
    private String descripcion;

    @Column(name = "fechaObtencion", nullable = false)
    private LocalDate fechaObtencion;
	
	@ManyToOne // Relación muchos a uno con Persona
    @JoinColumn(name = "persona_id", referencedColumnName = "id", nullable = false)
    private Persona persona;

	public Certificacion() {
	}

	public Certificacion(Long id, String titulo, String descripcion, LocalDate fechaObtencion, Persona persona) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaObtencion = fechaObtencion;
		this.persona = persona;
	}
	
}
