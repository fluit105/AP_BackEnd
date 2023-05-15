package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "url_foto")
public class Url_Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url_foto", length = 100, nullable = false)
    private String urlFoto;

    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "estudio_id")
    private Estudio estudio;

    @ManyToOne
    @JoinColumn(name = "estudio_persona_id")
    private Estudio estudioPersona;

    @ManyToOne
    @JoinColumn(name = "certificacion_id")
    private Certificacion certificacion;

    @ManyToOne
    @JoinColumn(name = "certificacion_persona_id")
    private Certificacion certificacionPersona;

    @ManyToOne
    @JoinColumn(name = "conocimiento_id")
    private Conocimiento conocimiento;

    @ManyToOne
    @JoinColumn(name = "conocimiento_persona_id")
    private Conocimiento conocimientoPersona;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

    @ManyToOne
    @JoinColumn(name = "proyecto_persona_id")
    private Proyecto proyectoPersona;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

	public Url_Foto() {
	}

	public Url_Foto(Long id, String urlFoto, String descripcion, Estudio estudio, Estudio estudioPersona, Certificacion certificacion, Certificacion certificacionPersona, Conocimiento conocimiento, Conocimiento conocimientoPersona, Proyecto proyecto, Proyecto proyectoPersona, Persona persona) {
		this.id = id;
		this.urlFoto = urlFoto;
		this.descripcion = descripcion;
		this.estudio = estudio;
		this.estudioPersona = estudioPersona;
		this.certificacion = certificacion;
		this.certificacionPersona = certificacionPersona;
		this.conocimiento = conocimiento;
		this.conocimientoPersona = conocimientoPersona;
		this.proyecto = proyecto;
		this.proyectoPersona = proyectoPersona;
		this.persona = persona;
	}

    
	
}
