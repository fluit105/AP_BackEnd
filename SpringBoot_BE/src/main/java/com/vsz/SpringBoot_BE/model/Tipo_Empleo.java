package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "tipo_empleo")
public class Tipo_Empleo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_tipo", length = 45, nullable = false)
    private String nombreTipo;

	public Tipo_Empleo() {
	}

	public Tipo_Empleo(int id, String nombreTipo) {
		this.id = id;
		this.nombreTipo = nombreTipo;
	}
	
}
