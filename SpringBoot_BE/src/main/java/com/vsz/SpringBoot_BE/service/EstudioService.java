package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Estudio;
import com.vsz.SpringBoot_BE.repository.EstudioRepository;
import java.util.List;
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
	
}
