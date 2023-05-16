package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombreEmpresa", length = 45, nullable = false)
    private String nombreEmpresa;

    @Column(name = "esTrabajoActual", nullable = false)
    private boolean esTrabajoActual;

    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate fechaFin;

    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "tipo_empleo_id", referencedColumnName = "id", nullable = false)
    private Tipo_Empleo tipoEmpleo;

	public Experiencia() {
	}

	public Experiencia(int id, String nombreEmpresa, boolean esTrabajoActual, LocalDate fechaInicio, LocalDate fechaFin, String descripcion, Persona persona, Tipo_Empleo tipoEmpleo) {
		this.id = id;
		this.nombreEmpresa = nombreEmpresa;
		this.esTrabajoActual = esTrabajoActual;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.persona = persona;
		this.tipoEmpleo = tipoEmpleo;
	}

    
	
}
