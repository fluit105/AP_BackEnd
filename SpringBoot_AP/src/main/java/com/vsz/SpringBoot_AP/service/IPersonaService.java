package com.vsz.SpringBoot_AP.service;

import com.vsz.SpringBoot_AP.model.Persona;
import java.util.List;

/**
 * @author Santiago Valdez
 */
public interface IPersonaService {

	public List<Persona> verPersonas();

	public void crearPersona(Persona per);

	public void borrarPersona(Long id);

	public Persona buscarPersona(Long id);

}
