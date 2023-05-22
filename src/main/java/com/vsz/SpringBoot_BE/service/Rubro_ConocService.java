package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Rubro_Conoc;
import com.vsz.SpringBoot_BE.repository.Rubro_ConocRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class Rubro_ConocService implements IRubro_ConocService {

	@Autowired
	public Rubro_ConocRepository rubroRepo;

	public List<Rubro_Conoc> verRubro_Conocs() {
		List<Rubro_Conoc> listaRubro_Conocs = rubroRepo.findAll();
		return listaRubro_Conocs;
	}
	
	@Override
	public void crearRubro_Conoc(Rubro_Conoc rub) {
		rubroRepo.save(rub);
	}

	@Override
	public void borrarRubro_Conoc(Long id) {
		rubroRepo.deleteById(id);
	}

	@Override
	public Rubro_Conoc buscarRubro_Conoc(Long id) {
		return rubroRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarRubro_Conoc(Long id, Rubro_Conoc rub) {
		Optional<Rubro_Conoc> rubExistente = rubroRepo.findById(id);

		if (rubExistente.isPresent()) {
			Rubro_Conoc rubActual = rubExistente.get();
			rubActual.setNombre_rubro(rub.getNombre_rubro());
			
			rubroRepo.save(rubActual);
		}
	}
	
}
