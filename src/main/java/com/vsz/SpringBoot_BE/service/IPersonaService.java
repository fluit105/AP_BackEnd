package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Persona;
import java.util.List;

/** @author Santiago Valdez */

public interface IPersonaService {

	public List<Persona> verPersonas();
	
	public void crearPersona (Persona per);
	
	public void borrarPersona (Long id);
	
	public Persona buscarPersona (Long id);
	
}
