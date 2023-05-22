package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Tipo_Empleo;
import java.util.List;

/** @author Santiago Valdez */

public interface ITipo_EmpleoService {
	
	public List<Tipo_Empleo> verTipo_Empleos();
	
	public void crearTipo_Empleo (Tipo_Empleo tip);
	
	public void borrarTipo_Empleo (Long id);
	
	public Tipo_Empleo buscarTipo_Empleo (Long id);
	
	public void modificarTipo_Empleo (Long id, Tipo_Empleo tip);

}
