package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "conocimiento")
public class Conocimiento {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 45, nullable = false)
    private String titulo;

    @Column(name = "descripcion", length = 45, nullable = false)
    private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY) // Relación muchos a uno con Persona
    @JoinColumn(name = "persona_id", referencedColumnName = "id", nullable = false)
    private Persona persona;
	
}
