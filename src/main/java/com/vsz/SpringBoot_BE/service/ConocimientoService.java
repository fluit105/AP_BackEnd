package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Conocimiento;
import com.vsz.SpringBoot_BE.repository.ConocimientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class ConocimientoService implements IConocimientoService {

	@Autowired
	public ConocimientoRepository conocRepo;

	@Override
	public List<Conocimiento> verConocimientos() {
		List<Conocimiento> listaConocimientos = conocRepo.findAll();
		return listaConocimientos;
	}
	
	
}
