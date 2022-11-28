package com.test.Encuesta.service;

import java.util.List;

import com.test.Encuesta.model.Estilo;

public interface EstiloService {

	List<Estilo> findAll();

	Estilo save(Estilo estilo);
}
