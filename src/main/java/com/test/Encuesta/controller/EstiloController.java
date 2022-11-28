package com.test.Encuesta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Encuesta.model.Estilo;
import com.test.Encuesta.service.EstiloService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/estilo" })
public class EstiloController {

	@Autowired
	EstiloService service;

	@GetMapping("/getEstilo")
	public ResponseEntity<List<Estilo>> getEstilo() {
		return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
	}
	@PostMapping("/crear")
	public ResponseEntity<Estilo> crearEstilo(@RequestBody Estilo estilo)
	{
		return new ResponseEntity<>(service.save(estilo),HttpStatus.CREATED);
	}
}
