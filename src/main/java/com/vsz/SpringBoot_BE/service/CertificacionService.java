package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Certificacion;
import com.vsz.SpringBoot_BE.repository.CertificacionRepository;
import java.util.List;
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

}
