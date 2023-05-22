package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Experiencia;
import java.util.List;

/** @author Santiago Valdez */

public interface IExperienciaService {

	public List<Experiencia> verExperiencias();
	
	public void crearExperiencia (Experiencia exp);
	
	public void borrarExperiencia (Long id);
	
	public Experiencia buscarExperiencia (Long id);
	
	public void modificarExperiencia (Long id, Experiencia exp);
	
}
