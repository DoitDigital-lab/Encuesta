package com.test.Encuesta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Encuesta.dao.EstiloRepository;
import com.test.Encuesta.model.Estilo;

@Service
public class EstiloServiceImp implements EstiloService {

	@Autowired
	private EstiloRepository repositorio;

	@Override
	public List<Estilo> findAll() {
		return repositorio.findAll();
	}

	@Override
	public Estilo save(Estilo estilo) {
		return repositorio.save(estilo);
	}

}
