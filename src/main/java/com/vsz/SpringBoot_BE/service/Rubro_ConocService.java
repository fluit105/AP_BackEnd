package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Rubro_Conoc;
import com.vsz.SpringBoot_BE.repository.Rubro_ConocRepository;
import java.util.List;
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
	
}
