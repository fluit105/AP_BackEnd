package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Url_Foto;
import com.vsz.SpringBoot_BE.repository.Url_FotoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class Url_FotoService implements IUrl_FotoService {

	@Autowired
	public Url_FotoRepository urlRepo;

	@Override
	public List<Url_Foto> verUrl_Fotos() {
		List<Url_Foto> listaUrl_Fotos = urlRepo.findAll();
		return listaUrl_Fotos;
	}
	
}
