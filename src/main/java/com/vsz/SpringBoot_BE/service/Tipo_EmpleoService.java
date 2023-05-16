package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Tipo_Empleo;
import com.vsz.SpringBoot_BE.repository.Tipo_EmpleoRepository;
import java.util.List;
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
	
}
