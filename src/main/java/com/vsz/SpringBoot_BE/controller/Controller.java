package com.vsz.SpringBoot_BE.controller;

import com.vsz.SpringBoot_BE.model.*;
import com.vsz.SpringBoot_BE.service.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-frontend-ap-da272.web.app")
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
		return "API REST funcionando";
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
	
	@PostMapping("/new/persona")
	public void crearPersona(@RequestBody Persona pers) {
		persoServ.crearPersona(pers);
	}
	
	@DeleteMapping("/drop/persona/{id}")
	public void borrarPersona(@PathVariable Long id) {
		persoServ.borrarPersona(id);
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
	
	@PostMapping("/new/url_foto")
	public void crearURL_Foto(@RequestBody Url_Foto url) {
		url_fotoServ.crearURL_Foto(url);
	}
	
	@DeleteMapping("/drop/url_foto/{id}")
	public void borrarUrl_Foto(@PathVariable Long id) {
		url_fotoServ.borrarUrl_Foto(id);
	}
	
	@PutMapping("/edit/url_fotos/{id}")
	public void modificarURL_Foto(@PathVariable Long id, @RequestBody Url_Foto url) {
		url_fotoServ.modificarURL_Foto(id, url);
	}
	
}
