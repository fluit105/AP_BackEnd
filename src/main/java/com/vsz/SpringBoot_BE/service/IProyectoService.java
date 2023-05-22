package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Proyecto;
import java.util.List;

/** @author Santiago Valdez */

public interface IProyectoService {
	
	public List<Proyecto> verProyectos();
	
	public void crearProyecto (Proyecto pro);
	
	public void borrarProyecto (Long id);
	
	public Proyecto buscarProyecto (Long id);
	
	public void modificarProyecto (Long id, Proyecto pro);

}
