package com.test.Encuesta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Encuesta.dao.RespuestaRepository;
import com.test.Encuesta.model.Respuesta;

@Service
public class RespuestaServiceImp implements RespuestaService {

	@Autowired
	private RespuestaRepository repositorio;

	@Override
	public List<Respuesta> findAll() {
		return repositorio.findAll();
	}

	@Override
	public Respuesta save(Respuesta respuesta) {
		return repositorio.save(respuesta);
	}

}
