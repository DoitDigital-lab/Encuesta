package com.test.Encuesta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Encuesta.model.Persona;
import com.test.Encuesta.service.PersonaService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/personas" })
public class PersonaController {

	@Autowired
	PersonaService service;

	@GetMapping("/getAllPersonas")
	public List<Persona> listar() {
		return service.listar();
	}

	@GetMapping("/hi")
	public String hi() {
		return "hola mundo";
	}

}
