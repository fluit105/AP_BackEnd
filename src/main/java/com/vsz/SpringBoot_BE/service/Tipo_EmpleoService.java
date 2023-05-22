package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Tipo_Empleo;
import com.vsz.SpringBoot_BE.repository.Tipo_EmpleoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class Tipo_EmpleoService implements ITipo_EmpleoService{

	@Autowired
	public Tipo_EmpleoRepository tip_empRepo;

	@Override
	public List<Tipo_Empleo> verTipo_Empleos() {
		List<Tipo_Empleo> listaTipo_Empleos = tip_empRepo.findAll();
		return listaTipo_Empleos;
	}
	
	@Override
	public void crearTipo_Empleo(Tipo_Empleo tip) {
		tip_empRepo.save(tip);
	}

	@Override
	public void borrarTipo_Empleo(Long id) {
		tip_empRepo.deleteById(id);
	}

	@Override
	public Tipo_Empleo buscarTipo_Empleo(Long id) {
		return tip_empRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarTipo_Empleo(Long id, Tipo_Empleo tip) {
		Optional<Tipo_Empleo> tipExistente = tip_empRepo.findById(id);

		if (tipExistente.isPresent()) {
			Tipo_Empleo tipActual = tipExistente.get();
			tipActual.setNombreTipo(tip.getNombreTipo());
			
			tip_empRepo.save(tipActual);
		}
	}
	
}
