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

import com.test.Encuesta.model.Respuesta;
import com.test.Encuesta.service.RespuestaService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/respuesta" })
public class RespuestaController {

	@Autowired
	RespuestaService service;

	@GetMapping("/getRespuesta")
	public List<Respuesta> getRespuesta() {
		return service.findAll();
	}

	@PostMapping("crear")
	public ResponseEntity<Respuesta> crearRespuesta(@RequestBody Respuesta respuesta) {
		return new ResponseEntity<>(service.save(respuesta), HttpStatus.CREATED);
	}
}
