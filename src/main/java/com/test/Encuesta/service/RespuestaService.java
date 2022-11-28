package com.test.Encuesta.service;

import java.util.List;

import com.test.Encuesta.model.Respuesta;

public interface RespuestaService {
	List<Respuesta> findAll();
	Respuesta save(Respuesta respuesta);
}
