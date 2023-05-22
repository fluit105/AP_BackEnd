package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Proyecto;
import com.vsz.SpringBoot_BE.repository.ProyectoRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
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
	
	@Override
	public void crearProyecto(Proyecto pro) {
		proyeRepo.save(pro);
	}

	@Override
	public void borrarProyecto(Long id) {
		proyeRepo.deleteById(id);
	}

	@Override
	public Proyecto buscarProyecto(Long id) {
		return proyeRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarProyecto(Long id, Proyecto pro) {
		Optional<Proyecto> proExistente = proyeRepo.findById(id);

		if (proExistente.isPresent()) {
			Proyecto proActual = proExistente.get();
			proActual.setDescripcion(pro.getDescripcion());
			proActual.setFechaInicio(pro.getFechaInicio());
			proActual.setFechaFin(pro.getFechaFin());
			proActual.setTitulo(pro.getTitulo());
			proActual.setPersona(pro.getPersona());
			
			proyeRepo.save(proActual);
		}
	}

}
