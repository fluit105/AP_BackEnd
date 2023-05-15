package com.vsz.SpringBoot_BE.controller;

import com.vsz.SpringBoot_BE.model.Persona;
import com.vsz.SpringBoot_BE.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** @author Santiago Valdez */

@RestController
public class Controller {

	@Autowired
	private IPersonaService persoServ;
	
	@GetMapping("/ver/personas")
	@ResponseBody
	public List<Persona> verPersonas() {
		return persoServ.verPersonas();
	}
	
}
