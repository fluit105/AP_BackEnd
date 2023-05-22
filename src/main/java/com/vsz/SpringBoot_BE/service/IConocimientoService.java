package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Conocimiento;
import java.util.List;

/**
 * @author Santiago Valdez
 */
public interface IConocimientoService {

	public List<Conocimiento> verConocimientos();
	
	public void crearConocimiento (Conocimiento con);
	
	public void borrarConocimiento (Long id);
	
	public Conocimiento buscarConocimiento (Long id);
	
	public void modificarConocimiento (Long id, Conocimiento con);
	
}
