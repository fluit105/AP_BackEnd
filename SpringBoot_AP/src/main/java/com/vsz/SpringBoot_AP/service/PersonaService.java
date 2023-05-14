package com.vsz.SpringBoot_AP.service;

import com.vsz.SpringBoot_AP.model.Persona;
import com.vsz.SpringBoot_AP.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Santiago Valdez
 */

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	public PersonaRepository persoRepo;

	@Override
	public List<Persona> verPersonas() {
		List<Persona> listaPersonas = persoRepo.findAll();
		return listaPersonas;
	}

	@Override
	public void crearPersona(Persona per) {
		persoRepo.save(per);
	}

	@Override
	public void borrarPersona(Long id) {
		persoRepo.deleteById(id);
	}

	@Override
	public Persona buscarPersona(Long id) {
		Persona perso = persoRepo.findById(id).orElse(null);
		return perso;
	}

}
