package com.test.Encuesta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.Encuesta.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
	List<Persona> findAll();
}
