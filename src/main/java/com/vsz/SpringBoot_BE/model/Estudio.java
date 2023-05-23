package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "estudio")

public class Estudio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 45, nullable = false)
    private String titulo;

    @Column(name = "descripcion", length = 1600, nullable = false)
    private String descripcion;

    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate fechaFin;
	
	@Column(name = "institucion", length = 45, nullable = false)
    private String institucion;

    @ManyToOne // Relación muchos a uno con Persona
    @JoinColumn(name = "persona_id", referencedColumnName = "id", nullable = false)
    private Persona persona;
	
}
