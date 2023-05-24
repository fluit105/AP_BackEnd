package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Url_Foto;
import com.vsz.SpringBoot_BE.repository.Url_FotoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Santiago Valdez
 */
@Service
public class Url_FotoService implements IUrl_FotoService {

	@Autowired
	public Url_FotoRepository urlRepo;

	@Override
	public List<Url_Foto> verUrl_Fotos() {
		List<Url_Foto> listaUrl_Fotos = urlRepo.findAll();
		return listaUrl_Fotos;
	}

	@Override
	public void crearURL_Foto(Url_Foto url) {
		urlRepo.save(url);
	}

	@Override
	public void borrarUrl_Foto(Long id) {
		urlRepo.deleteById(id);
	}

	@Override
	public Url_Foto buscarUrl_Foto(Long id) {
		return urlRepo.findById(id).orElse(null);
	}

	@Override
	public void modificarURL_Foto(Long id, Url_Foto url) {
		Optional<Url_Foto> urlExistente = urlRepo.findById(id);

		if (urlExistente.isPresent()) {
			Url_Foto urlActual = urlExistente.get();
			urlActual.setUrlFoto(url.getUrlFoto());
			urlActual.setDescripcion(url.getDescripcion());
			urlActual.setEstudio(url.getEstudio());
			urlActual.setCertificacion(url.getCertificacion());
			urlActual.setConocimiento(url.getConocimiento());
			urlActual.setProyecto(url.getProyecto());
			urlActual.setPersona(url.getPersona());
			
			urlRepo.save(urlActual);
		}
	}

}
