package com.vsz.SpringBoot_BE.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

/** @author Santiago Valdez */

@Getter @Setter
@Entity
@Table(name = "rubro_conoc")
public class Rubro_Conoc {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_rubro", length = 45, nullable = false)
    private String nombre_rubro;
	
}
