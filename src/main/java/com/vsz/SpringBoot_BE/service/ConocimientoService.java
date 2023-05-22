package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Conocimiento;
import com.vsz.SpringBoot_BE.repository.ConocimientoRepository;
import java.util.List;
import java.util.Optional;
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
	
	@Override
	public void crearConocimiento(Conocimiento con) {
		conocRepo.save(con);
	}

	@Override
	public void borrarConocimiento(Long id) {
		conocRepo.deleteById(id);
	}

	@Override
	public Conocimiento buscarConocimiento(Long id) {
		return conocRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarConocimiento(Long id, Conocimiento con) {
		Optional<Conocimiento> conExistente = conocRepo.findById(id);

		if (conExistente.isPresent()) {
			Conocimiento conActual = conExistente.get();
			conActual.setDescripcion(con.getDescripcion());
			conActual.setTitulo(con.getTitulo());
			conActual.setPersona(con.getPersona());
			conActual.setRubro_conoc(con.getRubro_conoc());
			
			conocRepo.save(conActual);
		}
	}
	
	
}
