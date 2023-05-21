package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Persona;
import com.vsz.SpringBoot_BE.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
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
		return persoRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarPersona(Long id, Persona per) {
		Optional<Persona> perExistente = persoRepo.findById(id);

		if (perExistente.isPresent()) {
			Persona perActual = perExistente.get();
			perActual.setNombre(per.getNombre());
			perActual.setApellido(per.getApellido());
			perActual.setOcupacion(per.getOcupacion());
			perActual.setNivel(per.getNivel());
			perActual.setDomicilio(per.getDomicilio());
			perActual.setFechaNac(per.getFechaNac());
			perActual.setTelefono(per.getTelefono());
			perActual.setCorreo(per.getCorreo());
			perActual.setResumen(per.getResumen());
			perActual.setLinkedin(per.getLinkedin());
			
			persoRepo.save(perActual);
		}
	}
	
}
