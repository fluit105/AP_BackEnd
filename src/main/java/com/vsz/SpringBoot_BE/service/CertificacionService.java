package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Certificacion;
import com.vsz.SpringBoot_BE.repository.CertificacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Santiago Valdez */

@Service
public class CertificacionService implements ICertificacionService {

	@Autowired
	public CertificacionRepository certiRepo;

	@Override
	public List<Certificacion> verCertificaciones() {
		List<Certificacion> listaCertificaciones = certiRepo.findAll();
		return listaCertificaciones;
	}
	
	@Override
	public void crearCertificacion(Certificacion cer) {
		certiRepo.save(cer);
	}

	@Override
	public void borrarCertificacion(Long id) {
		certiRepo.deleteById(id);
	}

	@Override
	public Certificacion buscarCertificacion(Long id) {
		return certiRepo.findById(id).orElse(null);
	}
	
	@Override
	public void modificarCertificacion(Long id, Certificacion cer) {
		Optional<Certificacion> cerExistente = certiRepo.findById(id);

		if (cerExistente.isPresent()) {
			Certificacion cerActual = cerExistente.get();
			
			
			certiRepo.save(cerActual);
		}
	}

}
