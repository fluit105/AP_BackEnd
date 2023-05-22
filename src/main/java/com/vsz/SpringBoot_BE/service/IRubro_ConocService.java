package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Rubro_Conoc;
import java.util.List;

/** @author Santiago Valdez */

public interface IRubro_ConocService {
	
	public List<Rubro_Conoc> verRubro_Conocs();
	
	public void crearRubro_Conoc (Rubro_Conoc rub);
	
	public void borrarRubro_Conoc (Long id);
	
	public Rubro_Conoc buscarRubro_Conoc (Long id);
	
	public void modificarRubro_Conoc (Long id, Rubro_Conoc rub);

}
