package com.vsz.SpringBoot_BE.service;

import com.vsz.SpringBoot_BE.model.Url_Foto;
import java.util.List;

/** @author Santiago Valdez */

public interface IUrl_FotoService {
	
	public List<Url_Foto> verUrl_Fotos();
	
	public void crearURL_Foto (Url_Foto url);
	
	public void borrarUrl_Foto (Long id);
	
	public Url_Foto buscarUrl_Foto (Long id);

}
