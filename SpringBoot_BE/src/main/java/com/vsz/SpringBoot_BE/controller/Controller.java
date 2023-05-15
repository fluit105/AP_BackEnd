package com.vsz.SpringBoot_BE.controller;

//import com.vsz.SpringBoot_BE.service.ICertificacionService;
//import com.vsz.SpringBoot_BE.service.IConocimientoService;
//import com.vsz.SpringBoot_BE.service.IEstudioService;
//import com.vsz.SpringBoot_BE.service.IExperienciaService;
import com.vsz.SpringBoot_BE.model.Persona;
import com.vsz.SpringBoot_BE.service.IPersonaService;
import java.util.List;
//import com.vsz.SpringBoot_BE.service.IProyectoService;
//import com.vsz.SpringBoot_BE.service.IRubro_ConocService;
//import com.vsz.SpringBoot_BE.service.ITipo_EmpleoService;
//import com.vsz.SpringBoot_BE.service.IUrl_FotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** @author Santiago Valdez */

@RestController
public class Controller {

	@Autowired
//	private ICertificacionService certifServ;
//	private IConocimientoService conocServ;
//	private IEstudioService estudServ;
//	private IExperienciaService experiServ;
	private IPersonaService persoServ;
//	private IProyectoService proyeServ;
//	private IRubro_ConocService Serv;
	
	@GetMapping("/ver/personas")
	@ResponseBody
	public List<Persona> verPersonas() {
		return persoServ.verPersonas();
	}
	
}
