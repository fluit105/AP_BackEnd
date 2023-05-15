package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Persona;
import com.vsz.SpringBoot_BE.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	public PersonaRepository persoRepo;

	@Override
	public List<Persona> verPersonas() {
		List<Persona> listaPersonas = persoRepo.findAll();
		return listaPersonas;
	}
	
	
	
}
