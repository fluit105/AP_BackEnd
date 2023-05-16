package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Proyecto;
import com.vsz.SpringBoot_BE.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class ProyectoService implements IProyectoService {
	
	@Autowired
	public ProyectoRepository proyeRepo;

	@Override
	public List<Proyecto> verProyectos() {
		List<Proyecto> listaProyectos = proyeRepo.findAll();
		return listaProyectos;
	}

}
