package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Experiencia;
import com.vsz.SpringBoot_BE.repository.ExperienciaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class ExperienciaService implements IExperienciaService {
	
	@Autowired
	public ExperienciaRepository experRepo;

	@Override
	public List<Experiencia> verExperiencias() {
		List<Experiencia> listaExperiencias = experRepo.findAll();
		return listaExperiencias;
	}
	
	@Override
	public void crearExperiencia(Experiencia exp) {
		experRepo.save(exp);
	}

	@Override
	public void borrarExperiencia(Long id) {
		experRepo.deleteById(id);
	}

	@Override
	public Experiencia buscarExperiencia(Long id) {
		return experRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarExperiencia(Long id, Experiencia exp) {
		Optional<Experiencia> expExistente = experRepo.findById(id);

		if (expExistente.isPresent()) {
			Experiencia expActual = expExistente.get();
			expActual.setDescripcion(exp.getDescripcion());
			expActual.setEsTrabajoActual(exp.isEsTrabajoActual());
			expActual.setFechaInicio(exp.getFechaInicio());
			expActual.setFechaFin(exp.getFechaFin());
			expActual.setNombreEmpresa(exp.getNombreEmpresa());
			expActual.setPersona(exp.getPersona());
			expActual.setTipoEmpleo(exp.getTipoEmpleo());
			
			experRepo.save(expActual);
		}
	}
	
}
