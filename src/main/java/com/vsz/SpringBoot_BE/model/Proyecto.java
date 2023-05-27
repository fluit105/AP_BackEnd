package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 45, nullable = false)
    private String titulo;

    @Column(name = "descripcion", length = 3000, nullable = false)
    private String descripcion;

    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate fechaFin;

    @ManyToOne // Relación muchos a uno con Persona
    @JoinColumn(name = "persona_id", referencedColumnName = "id", nullable = false)
    private Persona persona;

	public Proyecto() {
	}

	public Proyecto(Long id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Persona persona) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.persona = persona;
	}

    
	
}
