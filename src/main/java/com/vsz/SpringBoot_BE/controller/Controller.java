package com.vsz.SpringBoot_BE.controller;

import com.vsz.SpringBoot_BE.model.*;
import com.vsz.SpringBoot_BE.service.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

	@Autowired
	private ICertificacionService certServ;
	@Autowired
	private IConocimientoService conocServ;
	@Autowired
	private IEstudioService estudServ;
	@Autowired
	private IExperienciaService expeServ;
	@Autowired
	private IPersonaService persoServ;
	@Autowired
	private IProyectoService proyeServ;
	@Autowired
	private IRubro_ConocService rub_conServ;
	@Autowired
	private ITipo_EmpleoService tip_empServ;
	@Autowired
	private IUrl_FotoService url_fotoServ;
	
	@GetMapping("/test")
	public String test() {
		return "Testing 1 2 3... Hola";
	}
	
	@GetMapping("/certificaciones")
	public List<Certificacion> verCertificaciones() {
		return certServ.verCertificaciones();
	}
	
	@GetMapping("/conocimientos")
	public List<Conocimiento> verConocimientos() {
		return conocServ.verConocimientos();
	}
	
	@GetMapping("/estudios")
	public List<Estudio> verEstudios() {
		return estudServ.verEstudios();
	}
	
	@GetMapping("/experiencias")
	public List<Experiencia> verExperiencias() {
		return expeServ.verExperiencias();
	}
	
	@GetMapping("/personas")
	public List<Persona> verPersonas() {
		return persoServ.verPersonas();
	}
	
	@GetMapping("/proyectos")
	public List<Proyecto> verProyectos() {
		return proyeServ.verProyectos();
	}
	
	@GetMapping("/rubro_conocimientos")
	public List<Rubro_Conoc> verRubro_Conocs() {
		return rub_conServ.verRubro_Conocs();
	}
	
	@GetMapping("/tipo_empleos")
	public List<Tipo_Empleo> verTipo_Empleos() {
		return tip_empServ.verTipo_Empleos();
	}
	
	@GetMapping("/url_fotos")
	public List<Url_Foto> verUrl_Fotos() {
		return url_fotoServ.verUrl_Fotos();
	}
	
}
