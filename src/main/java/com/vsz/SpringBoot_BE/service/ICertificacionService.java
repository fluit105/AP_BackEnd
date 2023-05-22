package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Certificacion;
import java.util.List;

/** @author Santiago Valdez */

public interface ICertificacionService {
	
	public List<Certificacion> verCertificaciones();
	
	public void crearCertificacion (Certificacion cer);
	
	public void borrarCertificacion (Long id);
	
	public Certificacion buscarCertificacion (Long id);
	
	public void modificarCertificacion (Long id, Certificacion cer);

}
