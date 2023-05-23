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
	
	@PostMapping("/new/certificacion")
	public void crearCertificacion(@RequestBody Certificacion cer) {
		certServ.crearCertificacion(cer);
	}
	
	@DeleteMapping("/drop/certificacion/{id}")
	public void borrarCertificacion(@PathVariable Long id) {
		certServ.borrarCertificacion(id);
	}
	
	@PutMapping("/edit/certificacion/{id}")
	public void modificarCertificacion(@PathVariable Long id, @RequestBody Certificacion cer) {
		certServ.modificarCertificacion(id, cer);
	}
	
	@GetMapping("/conocimientos")
	public List<Conocimiento> verConocimientos() {
		return conocServ.verConocimientos();
	}
	
	@PostMapping("/new/conocimiento")
	public void crearConocimiento(@RequestBody Conocimiento con) {
		conocServ.crearConocimiento(con);
	}
	
	@DeleteMapping("/drop/conocimiento/{id}")
	public void borrarConocimiento(@PathVariable Long id) {
		conocServ.borrarConocimiento(id);
	}
	
	@PutMapping("/edit/conocimiento/{id}")
	public void modificarConocimiento(@PathVariable Long id, @RequestBody Conocimiento con) {
		conocServ.modificarConocimiento(id, con);
	}
	
	@GetMapping("/estudios")
	public List<Estudio> verEstudios() {
		return estudServ.verEstudios();
	}
	
	@PostMapping("/new/estudio")
	public void crearEstudio(@RequestBody Estudio est) {
		estudServ.crearEstudio(est);
	}
	
	@DeleteMapping("/drop/estudio/{id}")
	public void borrarEstudio(@PathVariable Long id) {
		estudServ.borrarEstudio(id);
	}
	
	@PutMapping("/edit/estudio/{id}")
	public void modificarEstudio(@PathVariable Long id, @RequestBody Estudio est) {
		estudServ.modificarEstudio(id, est);
	}
	
	@GetMapping("/experiencias")
	public List<Experiencia> verExperiencias() {
		return expeServ.verExperiencias();
	}
	
	@PostMapping("/new/experiencia")
	public void crearExperiencia(@RequestBody Experiencia exp) {
		expeServ.crearExperiencia(exp);
	}
	
	@DeleteMapping("/drop/experiencia/{id}")
	public void borrarExperiencia(@PathVariable Long id) {
		expeServ.borrarExperiencia(id);
	}
	
	@PutMapping("/edit/experiencia/{id}")
	public void modificarExperiencia(@PathVariable Long id, @RequestBody Experiencia exp) {
		expeServ.modificarExperiencia(id, exp);
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
	
	@PutMapping("/edit/persona/{id}")
	public void modificarPersona(@PathVariable Long id, @RequestBody Persona per) {
		persoServ.modificarPersona(id, per);
	}
	
	@GetMapping("/proyectos")
	public List<Proyecto> verProyectos() {
		return proyeServ.verProyectos();
	}
	
	@PostMapping("/new/proyecto")
	public void crearProyecto(@RequestBody Proyecto pro) {
		proyeServ.crearProyecto(pro);
	}
	
	@DeleteMapping("/drop/proyecto/{id}")
	public void borrarProyecto(@PathVariable Long id) {
		proyeServ.borrarProyecto(id);
	}
	
	@PutMapping("/edit/proyecto/{id}")
	public void modificarProyecto(@PathVariable Long id, @RequestBody Proyecto pro) {
		proyeServ.modificarProyecto(id, pro);
	}
	
	@GetMapping("/rubro_conocimientos")
	public List<Rubro_Conoc> verRubro_Conocs() {
		return rub_conServ.verRubro_Conocs();
	}
	
	@PostMapping("/new/rubro_conocimiento")
	public void crearRubro_Conoc(@RequestBody Rubro_Conoc rub) {
		rub_conServ.crearRubro_Conoc(rub);
	}
	
	@DeleteMapping("/drop/rubro_conocimiento/{id}")
	public void borrarRubro_Conoc(@PathVariable Long id) {
		rub_conServ.borrarRubro_Conoc(id);
	}
	
	@PutMapping("/edit/rubro_conocimiento/{id}")
	public void modificarRubro_Conoc(@PathVariable Long id, @RequestBody Rubro_Conoc rub) {
		rub_conServ.modificarRubro_Conoc(id, rub);
	}
	
	@GetMapping("/tipo_empleos")
	public List<Tipo_Empleo> verTipo_Empleos() {
		return tip_empServ.verTipo_Empleos();
	}
	
	@PostMapping("/new/tipo_empleo")
	public void crearTipo_Empleo(@RequestBody Tipo_Empleo tip) {
		tip_empServ.crearTipo_Empleo(tip);
	}
	
	@DeleteMapping("/drop/tipo_empleo/{id}")
	public void borrarTipo_Empleo(@PathVariable Long id) {
		tip_empServ.borrarTipo_Empleo(id);
	}
	
	@PutMapping("/edit/tipo_empleo/{id}")
	public void modificarTipo_Empleo(@PathVariable Long id, @RequestBody Tipo_Empleo tip) {
		tip_empServ.modificarTipo_Empleo(id, tip);
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
