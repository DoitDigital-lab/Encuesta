package com.test.Encuesta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Encuesta.dao.PersonaRepository;
import com.test.Encuesta.model.Persona;

@Service
public class PersonaServiceImp implements PersonaService{

@Autowired
private PersonaRepository repositorio;
	
@Override
public List<Persona> listar() {
		
		return repositorio.findAll();
	}

}
