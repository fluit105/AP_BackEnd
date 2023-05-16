package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Experiencia;
import com.vsz.SpringBoot_BE.repository.ExperienciaRepository;
import java.util.List;
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
	
}
