package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Estudio;
import java.util.List;

/** @author Santiago Valdez */

public interface IEstudioService {
	
	public List<Estudio> verEstudios();
	
	public void crearEstudio (Estudio est);
	
	public void borrarEstudio (Long id);
	
	public Estudio buscarEstudio (Long id);
	
	public void modificarEstudio (Long id, Estudio est);

}
