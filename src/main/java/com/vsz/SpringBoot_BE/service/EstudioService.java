package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Estudio;
import com.vsz.SpringBoot_BE.repository.EstudioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class EstudioService implements IEstudioService {

	@Autowired
	public EstudioRepository estudRepo;

	@Override
	public List<Estudio> verEstudios() {
		List<Estudio> listaEstudios = estudRepo.findAll();
		return listaEstudios;
	}
	
	@Override
	public void crearEstudio(Estudio est) {
		estudRepo.save(est);
	}

	@Override
	public void borrarEstudio(Long id) {
		estudRepo.deleteById(id);
	}

	@Override
	public Estudio buscarEstudio(Long id) {
		return estudRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarEstudio(Long id, Estudio est) {
		Optional<Estudio> estExistente = estudRepo.findById(id);

		if (estExistente.isPresent()) {
			Estudio estActual = estExistente.get();
			estActual.setDescripcion(est.getDescripcion());
			estActual.setFechaInicio(est.getFechaInicio());
			estActual.setFechaFin(est.getFechaFin());
			estActual.setInstitucion(est.getInstitucion());
			estActual.setTitulo(est.getTitulo());
			estActual.setPersona(est.getPersona());
			
			estudRepo.save(estActual);
		}
	}
	
}
